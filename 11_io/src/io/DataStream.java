package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	public static void main(String[] args) throws IOException {  //FileNotFoundException 자식 --- 부모 IOException
		//DataOutputStream dos = new DataOutputStream(new FileOutputStream("result.txt")); , 너무길어
		
		FileOutputStream fos = new FileOutputStream("result.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeInt(25);
		dos.writeDouble(185.3);
		
		dos.close();
		
		//파일에 들어간 순서데로 나온다.
		DataInputStream dis = new DataInputStream(new FileInputStream("result.txt"));
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		System.out.println("키 = " + height);
		
		dis.close();
	
	}

}
 //f5 -> result.txt       