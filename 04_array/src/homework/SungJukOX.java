package homework;

import java.util.Scanner;

public class SungJukOX {
	static final String JUNG = "11111"; // 필드 -> 상수화
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);

	        System.out.print("인원수 입력: ");
	        int num = scan.nextInt();
	        
	        String[] name = new String[num];
	        String[] dap = new String[num];
	        char[][] ox = new char[num][5];
	        int[] score = new int[num];

	        // 각 학생의 이름과 답안지 입력
	        for (int i = 0; i < num; i++) {
	            System.out.print("이름 입력: ");
	            name[i] = scan.next();
	            
	            System.out.print("답안지 입력: ");
	            dap[i] = scan.next();
	        }

	        // OX 채점 및 점수 계산
	        for (int i = 0; i < num; i++) {
	            int correctCount = 0;

	            for (int j = 0; j < 5; j++) {
	                if (dap[i].charAt(j) == JUNG.charAt(j)) {
	                    ox[i][j] = 'O';
	                    correctCount++;
	                } else {
	                    ox[i][j] = 'X';
	                }
	            }
	            score[i] = correctCount * 20;
	        }

	        // 성적표 출력
	        System.out.println("\n*** 성적표 ***");
	        System.out.println("이름\t1 2 3 4 5\t점수");

	        for (int i = 0; i < num; i++) {
	            System.out.print(name[i] + "\t");
	            for (int j = 0; j < 5; j++) {
	                System.out.print(ox[i][j] + " ");
	            }
	            System.out.println("\t" + score[i]);
	        }

	        scan.close();


	}

}


/*
[문제] 성적처리 프로그램
- 5문제는 사지선다형 문제이다
- 정답은 "11111"
  static final String JUNG = "11111"; //필드 ---> 상수화
- 1문제당 20점씩 한다.
- 인원수는 고정이 아니다.
  
[예시 : 실행결과]
인원수 입력 : 2

이름 입력 : 홍길동
답안지 입력 : 12311

이름 입력 : 코난
답안지 입력 : 11311

    *** 성적표 ***
이름  1 2 3 4 5	점수
홍길동 O X X O O	60
코난  O O X O O	80
*/