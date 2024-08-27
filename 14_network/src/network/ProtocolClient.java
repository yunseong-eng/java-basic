package network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ProtocolClient {
	Socket socket;
	BufferedReader br;
	BufferedWriter bw;
	Scanner scan;
	
	public ProtocolClient() {
		try {
		    scan = new Scanner(System.in);
			socket = new Socket("localhost", 9500);
			
			//IO
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
		} catch (UnknownHostException e) {
			System.out.println("서버를 찾을 수 없습니다");
			e.printStackTrace();
			System.exit(0);
		} catch (IOException e) {
			System.out.println("서버와 연결이 안되었습니다");
			e.printStackTrace();
			System.exit(0);
		}
		//------------------------
		String message, line;
		
		try {
		while(true) {
			//서버로 보내기
			System.out.println();
			System.out.println("입장은 100:대화명 이라고 입력하세요");
			System.out.println("퇴장은 200:대화명 이라고 입력하세요");
			System.out.println("메세지는 300:대화명:메시지 이라고 입력하세요\n");
			message = scan.nextLine();
			
			bw.write(message + "\n"); //서버로 보내기
			bw.flush(); //버퍼를 비워줌
			
			//서버로부터 받기
			line = br.readLine();
			System.out.println(line);
			
			//200:apple -> "200", "apple"
			String[] ar = message.split(":");
			
			//if(ar[0].equals("200")) {
			if(ar[0].equals(Protocol.EXIT)) {
				br.close();
				bw.close();
				socket.close();
				
				System.out.println("클라이언트 종료");
				System.exit(0);
			}
			 
		  }//while
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//ProtocolClient()
	
	public static void main(String[] args) {
		new ProtocolClient();

	}

}
