package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ProtocolServer {
	ServerSocket serverSocket; 
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	
	public ProtocolServer() {
		try {
			serverSocket = new ServerSocket(9500); //클라이언트가 올 때까지 기다린다.
			System.out.println("서버준비완료..");
			
			socket = serverSocket.accept(); //클라이언트를 낚아채서 소켓을 생성한다.
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (IOException e) {
			System.out.println("클라이언트와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		
		//-------------------------
		String line;
		
		try {
			while(true) {
				//클라이언트로부터 받기
				line = br.readLine();
				
				//클라이언트로 보내기
				String[] ar = line.split(":");
				if(ar[0].equals(Protocol.ENTER)) {
					bw.write(ar[1] + "님 입장하였습니다\n");
					bw.flush();
					
				}else if(ar[0].equals(Protocol.EXIT)) {
					bw.write(ar[1] + "님 퇴장하였습니다\n");
					bw.flush();
					
					br.close();
					bw.close();
					socket.close();
					
					System.exit(0);
					
				}else if(ar[0].equals(Protocol.SEND_MESSAGE)) {
					bw.write("[" + ar[1] + "]" + ar[2] + "\n");
					bw.flush();
					
				}
				
			}//while
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	} //ProtocolServer()

	public static void main(String[] args) {
		new ProtocolServer();

	}

}
