package abstract_;

import java.util.Calendar;
import java.util.Scanner;
//달력을 생성하고 출력하는 클래스
class CalendarEX {
	 private int year, month, week, lastDay;
	 
	 //기본생성자
	 public CalendarEX() {
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("년도 입력 : ");
	    year = scan.nextInt();
	    System.out.print("월 입력 : ");
	    month = scan.nextInt();
		
	}
	 //달력을 계산하는 메소드
	 public void calc() {
		 //시스템 날짜를 기준으로 생성 => 2024.07.18
		 Calendar cal = Calendar.getInstance();
		 
		 //cal.set(Calendar.YEAR, year);
		 //cal.set(Calendar.MONTH, month-1);
		 //cal.set(Calendar.DAY_OF_MONTH, 1);
		 
		 // Calendar 객체에 사용자로부터 입력받은 년도와 월 설정 (월은 0부터 시작하므로 -1 필요)
		 cal.set(year, month, 1);
		 
		 week = cal.get(Calendar.DAY_OF_WEEK); //1일의 요일 구하여 week변수에 저장
		 System.out.println(week);
		 lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //월의 마지막 일 구하기
	 }
	 
	 public void display() {
		 System.out.println("일\t월\t화\t수\t목\t금\t토");
		 // 1일이 시작되는 요일까지 빈 칸 출력
		 for(int i=1; i<week; i++) {
			 System.out.print("\t");
		 }
		 // 1일부터 마지막 날까지 날짜 출력
		 for(int i=1; i<=lastDay; i++) {
			 System.out.print(i + "\t");
			 // 요일이 토요일이면 줄 바꿈
			 if(week%7 == 0) System.out.println();
			 week++;
		 }
	 }
	 
}

//------------------------
public class CalendarMain {
	// CalendarEX 클래스를 실행
    public static void main(String[] args) {
    	CalendarEX calendarEX = new CalendarEX();//객체생성
    	calendarEX.calc(); //달력계산
    	calendarEX.display(); //달력출력
    }
}

/*
[문제] 만년달력

[클래스]
CalendarEx
[필드]
필드는 원하는 것으로 직접 잡기 
[메소드]
생성자를 통해서 : 년도, 월을 입력
- 기본생성자 : 입력
- 메소드 : calc() -> 매달 1일의 요일이 무엇인지? (Calendar에 메소드를 찾아서 수행)
                -> 매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드를 찾아서 수행)
         display() -> 출력
         
[클래스]
CalendarMain         

[실행결과]
년도 입력 : 2024                        년도 입력 : 2000
월 입력 : 1                             월 입력 : 2

일   월   화   수   목   금   토         일   월   화   수   목   금   토
     1   2   3   4    5    6                 1    2   3   4    5
7    8   9   10  11   12   13        6   7   8    9   10  11   12
14   15  16  17  18   19   20        13  14  15   16  17  18   19
21   22  23  24  25   26   27        20  21  22   23  24  25   26
28   29  30  31                      27  28  29
*/