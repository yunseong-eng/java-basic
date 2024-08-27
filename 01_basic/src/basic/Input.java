package basic;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); //키보드를 통해서 입력 할 수 있는 클래스를 생성
		
		System.out.print("정수형 데이터 입력 : ");
		int a = scan.nextInt();//사용자가 입력한 정수형 데이터를 변수 a에 저장
		
		System.out.print("실수형 데이터 입력 : ");
		double b = scan.nextDouble();
		
		System.out.println(a + " + " + b + " = " + (a+b));
	}

}
