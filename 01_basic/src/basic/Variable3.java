package basic;

import java.util.Random;

public class Variable3 {

	public static void main(String[] args) {
		int big = Math.max(25, 36);
		System.out.println("큰값 = " + big);
		
		//12.7, 78.5중에서 작은값을 구하시오
		double small = Math.min(12.7,  78.5);
		System.out.println("작은값 = " + small);
		
		//2의 5승
		double power = Math.pow(2 , 5);
		System.out.println("2의 5승 = " + power);
		
		//컴퓨터가 불규칙하게 발생하는 수 -> 난수
		// 0 <= 난수 < 1
		double a = Math.random();//random이라는 애가 난수값을 일으킨다. 돈을 안넣어도 난수가 나온다., java.lang Math클래스
		int c = (int)(a * 100); // 0 ~ 99 //100을 먼저 곱하고 해야 0이 안나와서 ()를 넣어줌
		
		// x ~ y 사이의 난수 발생
		// (int)(Math.randome() * (y-x+1) + x)
		int d = (int)(Math.random() * 26 + 65); //65 ~ 90 사이의 난수
		char e = (char)(Math.random() * 26 + 65);
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println();
		
		double b = new Random().nextDouble();//Random 클래스 ,static이 아니라 클래스에 new가 붙어야됨
		System.out.println(b);
	}

}
