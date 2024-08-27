package homework;

import java.util.Scanner;

public class Jinsu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("10진수 데이터 입력 : ");
		int dec = scan.nextInt();
				
		String bin = Integer.toBinaryString(dec); 
		String oct = Integer.toOctalString(dec);
		String hex = Integer.toHexString(dec);
		
		System.out.println("10진수: " + dec);// 사람
		System.out.println("2진수: " + bin); //2진수란 2진수가 표현할수있는 한자리 0,1 (2를 넘어가면안됨) , 기계
		System.out.println("8진수: " + oct); // 
		System.out.println("16진수: " + hex); //10을 a로 [0~ f]

/*
 [문제] 
 정수형 데이터를 입력하여 2진수, 8진수, 16진수로 변환한 값을 출력하시오
 -Scanner 클래스 사용
[조건]
2진수, 8진수, 16진수로 변환시켜주는 메소드를 이용하시오 - Integer

[실행결과]
	10진수 데이터 입력 : 250 (dec)

	2진수 = 11111010 (bin)
	8진수 = 372 (oct)
	16진수 = fa (hex)
*/

	}

}
