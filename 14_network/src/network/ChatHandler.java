package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class ChatHandler {
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;
	String clientIp;

	public ChatHandler(ChatServer chatServer, Socket socket) throws IOException {
		this.chatServer = chatServer;
		this.socket = socket;
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		
		InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress(); //클라이언트의 주소
		clientIp = isa.getHostName();
		
		receive();
	}

	//클라이언트로부터 오는 JSON 데이터 받기
	public void receive() {
		chatServer.threadPool.execute(() -> {
			try {
				while(true) {
					String receiveJSON = dis.readUTF();
					
					JSONObject jsonObject = new JSONObject(receiveJSON);
					String command = jsonObject.getString("command");
					
					switch(command) {
					case "enter": 
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "입장하셨습니다");
						chatServer.addSocketClient(this);
						break;
					case "message":
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
						break;
					}
				}//while
			}catch(IOException e) {
				chatServer.sendToAll(this, "퇴장하셨습니다");
				chatServer.removeSocketClient(this);
			}
		});
	}

	//클라이언트로 JSON 데이터 보내기
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();

		} catch (IOException e) {
			//e.printStackTrace();
		}	
	}

	public void close() {
		try {
			socket.close();
		} catch (IOException e) {
			//e.printStackTrace();
		}
	}


}
