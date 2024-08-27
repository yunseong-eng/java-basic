package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3); //3가지 데이터를 하나의 dto로 묶어버림
		
		oos.writeObject(dto);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		
		PersonDTO dto2 = (PersonDTO)ois.readObject(); //자식 = (자식)부모
		System.out.println("이름 = " + dto2.getName());
		System.out.println("나이 = " + dto2.getAge());
		System.out.println("키 = " + dto2.getHeight());
		
		ois.close();
		

	}

}


//Buffer 에 넣었다가 객체로 보내라
//11_io에 f5번 누르면 result2.txt 생김