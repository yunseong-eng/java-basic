package compute;

import java.util.Scanner;

public class Sum implements Compute { //Compute interface 구현
	private int x, y; //입력받을 숫자들 저장변수
	
	//생성자
	public Sum() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x의 값 입력 : ");
		x = scan.nextInt();
		System.out.print("y의 값 입력 : ");
		y = scan.nextInt();
	}
	
	// execute 메소드 구현 (덧셈 연산 수행)
	@Override
	public void execute() {
		System.out.println(x + " + " + y + " = " + (x+y));
		
	}
	

}
