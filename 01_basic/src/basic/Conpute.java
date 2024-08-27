package basic;

import java.text.DecimalFormat; //java.lang이 아니라 다른패키지에 있다는 겁니다

public class Conpute {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double)a / b; //정수형 나누기 정수형은 무조건 정수형이니 a랑 b중 하나를 double형으로 이 순간만 자동형변환
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul)); //new DecimalFormat().format 3자리마다 , 표시
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div)); //"%.2f" 소수이하 2째자리까지 출력

	}

}

/*
[문제] 변수를 이용하여 320(a), 258(b)의 합(sum), 차(sub), 곱(mul), 몫(div)를 구하시오

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = 82560 ---> 3자리마다 , 표시 320 * 258 = 82,560
320 / 258 = 1.2403100775193798 ---> 소수이하 2째자리까지 출력하시오
*/