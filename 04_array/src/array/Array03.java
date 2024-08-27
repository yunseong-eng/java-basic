package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 크기 입력 : ");
		int size = scan.nextInt();
		
		int[] ar = new int[size];
		
		int sum = 0;
		
		//입력
		for(int i=0; i<size; i++) {
			System.out.print("ar[" + i + "] 입력 : ");
			ar[i] = scan.nextInt();
			
			sum += ar[i];//sum = sum + ar[i]
		}
		System.out.println();
		
		//최대값, 최소값
		int max, min;
		max = min = ar[0];
		
		for(int i=1; i<size; i++) {
			if(ar[i] > max) max = ar[i];
			if(ar[i] < min) min = ar[i];
		}
		
		//출력
		for(int data : ar) {
			System.out.print(data + "  ");
		}//for i
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);


	}

}


/*
배열 크기 입력 : 3

ar[0] 입력 : 36
ar[1] 입력 : -25
ar[2] 입력 : 100

36  -25  100
합 = xxx
최대값
*/

