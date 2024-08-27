package class_;

import java.util.Scanner;

public class ComputeMain {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("횟수 입력 : ");
		int size = scan.nextInt();
		
		ComputeDTO[] ar = new ComputeDTO[size];
		
		//입력
		for(int i=0; i<ar.length; i++) {
			ar[i] = new ComputeDTO(); //객체 생성
			System.out.println("ar[" + i + "] = " + ar[i]);
			
			System.out.print("x 입력 : ");
			ar[i].setX(scan.nextInt());
			System.out.print("y 입력 : ");
			ar[i].setY(scan.nextInt());
			
			ar[i].calc();
			System.out.println();
		}
		
		//출력
		System.out.println("X\tY\tSum\tSub\tMul\tDiv");
		for(ComputeDTO data : ar) {
			System.out.println(data.getX()+"\t"
							 + data.getY()+"\t"
							 + data.getSum()+"\t"
							 + data.getSub()+"\t"
							 + data.getMul()+"\t"
							 + data.getDiv());
		}//for
		
	}

}

/*
[문제] 합, 차, 곱, 몫 구하시오

[실행결과]
횟수 입력 : 3

x 입력 : 320
y 입력 : 258

x 입력 : 256
y 입력 : 125

x 입력 : 452
y 입력 : 365


X		Y		SUM		SUB		MUL		DIV
320		258
256		125
452		365
 */




