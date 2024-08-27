package array;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		int[] ar; //배열 선언
		ar = new int[5]; //배열 방 []개 생성
		
		ar[0] = 25;
		ar[1] = 36;
		ar[2] = 42;
		ar[3] = 17;
		ar[4] = 95;
		
		System.out.println("배열명 ar = " + ar); //클래스명@16진수
		System.out.println("배열 크기 = " + ar.length); //배열 크기
		
		for(int i=0; i<ar.length; i++) {
			System.out.println("ar[" + i + "]" + ar[i]);
		}//for i
		System.out.println();
		
		System.out.println("거꾸로 출력");
		for(int i=ar.length-1; i>=0; i--) {
			System.out.println("ar[" + i + "]" + ar[i]);
		}//for i
		System.out.println();
		
		System.out.println("홀수 데이터만 출력");
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2 ==1) System.out.println("ar[" + i + "]" + ar[i]);
		}//for i
		System.out.println();
		
		System.out.println("첨자가 짝수인 것만 출력");//방번호가 짝수인것만 출력
		for(int i=0; i<ar.length; i++) {
			if(i%2 == 0) System.out.println("ar[" + i + "]" + ar[i]);
		}//for i
		System.out.println();
		
		System.out.println("오름차순 정렬");
		Arrays.sort(ar);
		
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i] + "  ");
		}//for i
		System.out.println("\n");
		
		System.out.println("확장 for문");
		for(int data : ar) {//ar.length를 안써도 배열 크기만큼 for문이 된다.
			System.out.println(data + "  ");
		}//for i
		System.out.println();

	}

}
