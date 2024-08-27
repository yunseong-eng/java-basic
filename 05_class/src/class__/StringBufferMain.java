package class__;

import java.util.Scanner;

public class StringBufferMain {
	private int dan;
	
	public StringBufferMain() {
		Scanner scan = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
	    dan = scan.nextInt();
	}

	public void output() { 
		StringBuffer buffer =new StringBuffer();
		
		for(int i=1; i<=9; i++) {
			//System.out.println(dan + " * " + i + " = " + dan*i );
			
			buffer.append(dan); 
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i);
			
			System.out.println(buffer);
			
			//기존의 있는 내용 삭제
			//buffer.delete(0, 4); //*4까지는 지워준다.
			buffer.delete(0, buffer.length());
		}
	}
	
	public static void main(String[] args) {
		new StringBufferMain().output();

	}

}


/*
원하는 단을 입력 : 2       →  생성자에서 처리
----------------------------
2 * 1 = 2             → output() 처리
2 * 2 = 4
~~~


2 * 9 = 18
*/