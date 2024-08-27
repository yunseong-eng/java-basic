package array;

import java.io.IOException;
import java.util.Scanner;

public class BaseBall {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int[] com = new int[3];
		int[] user = new int[3];
		String yn;
		int strike, ball;
		
		do {
		System.out.println("게임을 실행하시겠습니까(Y/N) : ");
		yn = scan.next();
		
		}while(!yn.equals("Y") && !yn.equals("y") && !yn.equals("N") && !yn.equals("n"));
		
		if(yn.equals("Y") || yn.equals("y")) {
		System.out.println("\n게임을 시작합니다");
		
		//난수 발생
		for(int i=0; i<com.length; i++) {
		com[i] = (int)(Math.random()*9 + 1);
		
		//중복체크
		for(int j=0; j<i; j++) {
		if(com[i] == com[j]) {
		i--;
		break;
		}
		}//for j
		}//for i
		
		//System.out.println(com[0] + " , " + com[1] + " , " + com[2]);
		
		//사용자의 값을 입력
		while(true) {
		System.out.println("\n숫자 입력 : ");
		for(int i=0; i<user.length; i++) {
		user[i] = System.in.read() - '0';
		}
		System.in.read();
		System.in.read();
		
		//System.out.println(user[0] + " , " + user[1] + " , " + user[2]);
		
		//비교
		strike = ball = 0;
		for(int i=0; i<com.length; i++) {
		for(int j=0; j<user.length; j++) {
		if(com[i] == user[j]) {
		if(i == j) strike++;
		else ball++;
		}
		}
		}//for i
		System.out.println(strike+"스트라이크 "+ball+"볼");
		
		if(strike == 3) break;
		
		}//while
		
		}//if
		
		System.out.println("\n프로그램을 종료합니다.");
	}

}

/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
- 발생한 난수를 맞추는 게임
- 난수는 중복을 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/