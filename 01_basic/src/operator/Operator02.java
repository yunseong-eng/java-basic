package operator;

import java.util.Scanner;

public class Operator02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		String result = score>=80 && score<=100 ? "합격" : "불합격";

		//System.out.println( score>=80 && score<=100 ? "합격" : "불합격" );
		
		System.out.println(result);


	}

}

/*
[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오
- Scanner 이용하시오
- 연산자 / % 사용하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
*/
