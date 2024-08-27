package for_;

import java.util.Scanner;

public class For05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x, y, mul=1;
	
		 while (true) {
			System.out.println();
	        System.out.println("x : ");
	        x = scan.nextInt();
	        if(x==0) break;
	        
	        do {
	        System.out.println("y : ");
	        y= scan.nextInt();
	        if(y >= 0 ) break;
	        else System.out.println("y는 0보다 큰 값을 입력해야 한다.\n");
	       
	   } while(true);
	        
	      //제곱승 계산
	        for(int i=1; i<=y; i++) {
	          mul *= x;	//mul = mul * x
	        }
	        
	        System.out.println(x + " 의 " + y + " 승 " + mul);
	        mul =1; //초기화
	        
		 }//while
			
			System.out.println("프로그램을 종료합니다.");


	}

}

/*
[문제] x와 y의 제곱승을 구하시오 ---> while, for문 사용
- y의 값이 음수가 들어오면 다시 입력한다.
- x의 값이 0이면 프로그램을 종료한다.

[실행결과 예시]
x : 2
y : 5
2의 5승 32

x : 2
y : -2
y는 0보다 큰 값을 입력해야 한다.
y : 7
2의 7승 128

x : 0
프로그램을 종료합니다.
*//*
[문제] x와 y의 제곱승을 구하시오 ---> while, for문 사용
- y의 값이 음수가 들어오면 다시 입력한다.
- x의 값이 0이면 프로그램을 종료한다.

[실행결과 예시]
x : 2
y : 5
2의 5승 32

x : 2
y : -2
y는 0보다 큰 값을 입력해야 한다.
y : 7
2의 7승 128

x : 0
프로그램을 종료합니다.
*//*
[문제] x와 y의 제곱승을 구하시오 ---> while, for문 사용
- y의 값이 음수가 들어오면 다시 입력한다.
- x의 값이 0이면 프로그램을 종료한다.

[실행결과 예시]
x : 2
y : 5
2의 5승 32

x : 2
y : -2
y는 0보다 큰 값을 입력해야 한다.
y : 7
2의 7승 128

x : 0
프로그램을 종료합니다.
*/

