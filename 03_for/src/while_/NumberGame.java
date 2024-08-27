package while_;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com, user, count=0;
		
		System.out.println("1 ~ 100 사이의 숫자가 발생했습니다.");
		com = (int)(Math.random() * 100 + 1);
		//System.out.println("com = " + com); --> 정답보기
		
		
		while(true) {
			System.out.println("숫자 입력 :");
			user = scan.nextInt();
			count++;
			
			if(com > user) System.out.println(user + "보다 큰 숫자입니다.");
			else if(com < user) System.out.println(user + "보다 작은 숫자입니다.");
			else break; //while문을 벗어나라
			
		}//while
		System.out.println();
		System.out.println("딩동뎅..." + count +"번만에 맞추셨습니다.");
		


	}

}

/*
[문제] 숫자 맞추기 게임
-숫자의 범위는 1부터 100 사이로 한다.
-컴퓨터가 숫자를 발생하면 사용자가 맞추는 프로그램이다.

[실행결과]
1 ~ 100 사이의 숫자가 발생했습니다.  예시(87)

숫자 입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 95
95보다 작은 숫자입니다.

~~~

숫자 입력 : 87
딩동뎅... ()번만에 맞추셨습니다. //while문
*/

