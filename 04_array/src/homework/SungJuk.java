package homework;

import java.util.Scanner;

public class SungJuk {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        
	        // 인원수 입력
	        System.out.print("인원수: ");
	        int cnt = scan.nextInt();
	        
	        // 배열 초기화
	        String[] names = new String[cnt];
	        String[][] subjects = new String[cnt][];
	        int[][] scores = new int[cnt][];
	        int[] totalScores = new int[cnt];
	        double[] averages = new double[cnt];
	        
	        // 각 학생의 데이터 입력
	        for (int i = 0; i < cnt; i++) {
	            System.out.print("이름 입력: ");
	            names[i] = scan.next();
	            
	            System.out.print("과목수 입력: ");
	            int subjectCnt = scan.nextInt();
	            
	            subjects[i] = new String[subjectCnt];
	            scores[i] = new int[subjectCnt];
	            
	            // 과목명 및 점수 입력
	            for (int j = 0; j < subjectCnt; j++) {
	                System.out.print("과목명 입력: ");
	                subjects[i][j] = scan.next();
	                
	                System.out.print(subjects[i][j] + " 점수 입력: ");
	                scores[i][j] = scan.nextInt();
	                
	                totalScores[i] += scores[i][j];
	            }
	            // 평균 계산
	            averages[i] = totalScores[i] / (double)subjectCnt;
	        }
	        
	        // 출력
	        System.out.print("\n이름\t\t");
	        for (int j = 0; j < subjects[0].length; j++) {
	            System.out.print(subjects[0][j] + "\t");
	        }
	        System.out.println("총점\t평균");
	        
	        for (int i = 0; i < cnt; i++) {
	            System.out.print(names[i] + "\t\t");
	            for (int j = 0; j < subjects[i].length; j++) {
	                System.out.print(scores[i][j] + "\t");
	            }
	            System.out.printf("%d\t%.2f\n", totalScores[i], averages[i]);
	        }

	        scan.close(); // 스캐너 닫기

	}

}

/*
[문제] 성적 계산
인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
-평균은 소수이하 2째자리까지 출력
-인원수는 고정이 아님

[예시 : 실행결과]
인원수 : 2 (cnt)

이름 입력 : 홍길동 (name)
과목수 입력 : 2   (subjectCnt)
과목명 입력 : 국어 (subject)
과목명 입력 : 영어
국어 점수 입력 : 95 (jumsu)
영어 점수 입력 : 100
---------------------
이름 입력 : 이기자
과목수 입력 : 3
과목명 입력 : 국어
과목명 입력 : 영어
과목명 입력 : 과학
국어 점수 입력 : 95
영어 점수 입력 : 100
과학 점수 입력 : 90
---------------------

이름     국어  영어   총점     평균
홍길동    95  100   xxx    xx.xx

이름  국어  영어   과학    총점      평균
이기자 95  100   90     xxx      xx.xx
*/

