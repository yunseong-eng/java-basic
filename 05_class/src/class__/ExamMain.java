package class__;

import java.util.Scanner;

public class ExamMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int size = scan.nextInt();
		
		Exam[] ar = new Exam[size];
		for(int i=0; i<size; i++) {
			ar[i] = new Exam(); //생성자 호출
			ar[i].compare();
	}//for
		
		//출력
		System.out.println();
		System.out.println("이름\t1 2 3 4 5 \t점수");
		for(int i=0; i<size; i++) {
			System.out.print(ar[i].getName() + "\t");
			
			for(int j=0; j<ar[i].getOx().length; j++) {
				System.out.print(ar[i].getOx()[j] + " ");
			}//for j
			
			System.out.println("\t" + ar[i].getScore());
			
		}//for i
	
		
	}

}

/*
[문제] 사지선다형
- 문제수는 총 5문제 제공
- 한 문제당 20점씩 처리한다.
- 정답은 무조건 "11111" 이다.
- 인원수 입력은 Main 메소드에서 한다.

클래스명 : Exam
* 필드
private String name = null;
private String dap = null;
private char[] ox = null;
private int score = 0;
private final String JUNG = "11111"; //상수화

* 메소드
기본 생성자 - Scanner 이용하여 이름, 답을 입력 받는다.
compare() - 비교
getName()
getOx()
getScore()

클래스명 : ExamMain

예시 : [실행결과]
인원수 입력 : 3 → 인원수만 main 메소드 활용

이름 입력 : 홍길동
답 입력 : 12311

이름 입력 : 김태리
답 입력 : 12341 

이름 입력 : 유연석
답 입력 : 12111 

이름   1 2 3 4 5	 점수
홍길동  O X X O O	 60
김태리  O X X X O	 40
유연석  O X O O O	 80

*/
