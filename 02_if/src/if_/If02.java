package if_;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		
		System.out.print("c의 값 : ");
		int c = scan.nextInt();
		
		double avg = (a+b+c) / 3.;
		
		if(avg >= 60)
			if(a>=40 && b>=40 && c>=40)
				System.out.println("합격");
			else
				System.out.println("과락으로 불합격");
		else 
			System.out.println("불합격");


	}

}
/*
[문제]
 3과목(a,b,c)의 점수를 입력받아서 합격인지 불합격인지 출력하시오
합격은 평균이 60점 이상이어야 하고 각 과목이 40점 이상이어야 한다
*/