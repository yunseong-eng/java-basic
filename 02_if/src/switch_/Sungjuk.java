package switch_;

public class Sungjuk {

	public static void main(String[] args) {
		char name = 'L';
		
		int kor = 85, eng = 90, math = 100;
		
		int tot = kor + eng + math;
		double avg = (double)tot /3;

		char grade;
		switch((int)avg / 10) {
		case 10:
		case 9 : grade = 'A'; break;
		case 8 : grade = 'B'; break;
		case 7 : grade = 'C'; break;
		case 6 : grade = 'D'; break;
		default : grade = 'F';
		}
		
		System.out.println("\t *** " + name + " 성적표 ***");
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + tot + "\t" + String.format("%.3f", avg) + "\t" + grade);;

		
		
		
		
		
/*
[문제] 성적 계산
이름이 L(name)이고 국어점수 85(kor), 영어점수 90(eng), 수학점수 100(math)일때 
총점(tot)과 평균(avg), 학점(grade)을 구하시오

[조건]
총점 = 국어 + 영어 + 수학
평균 = 총점 / 과목수
학점은 평균이 90이면 학점은 A 
	 평균이 80이면 학점은 B
	 평균이 70이면 학점은 C 
	 평균이 60이면 학점은 D 
	 그 외는  학점은 F 

평균의 소수이하 3째자리까지 출력

[실행결과]
 *** L 성적표 ***
국어 영어 수학 총점   평균     학점
85  90 100 xxx xx.xxx   A

*/

	}

}
