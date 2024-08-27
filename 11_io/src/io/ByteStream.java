package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		
		//파일에서 1글자씩 읽는다.
		while((data=bis.read()) != -1) {
			System.out.print((char)data); 
		}//while
		System.out.println();
		
		bis.close();  //ABCD
		              //1234
		              //+-*/

		
	}

}
/*
public static void main(String[] args) throws IOException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("data.txt"));
		int data;
		
		while((data=bis.read()) != -1) {
			System.out.print(data);
		}//while
		System.out.println();
		
		bis.close(); //656667681310495051521310434542471310 ,, 1310 -> enter \r\n
		
*/