package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date(); //new 를 해줘야 그때마다 바뀐 시간이 나온다
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 HH시 mm분 ss초"); //출력형식
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		//내 생일 => 19910505 => yyyyMMddHH
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHH"); //입력형식
		
		System.out.print("생일 날짜 입력 (yyyyMMddHH) : ");
		String birth = scan.next();
		
		Date birth_date = input.parse(birth); //String => Date 변환 
		System.out.println("내 생일 : " + birth_date);
		System.out.println("내 생일 : " + sdf.format(birth_date));
		System.out.println();
		
		//시스템의 날짜와 시간을 기준으로 생성한다.
		//Calendar cal = new Calendar(); -error 추상클래스
		//Calendar cal = new GregorianCalendar(); //Sub class 사용해서 생성
		Calendar cal = Calendar.getInstance(); //메소드 이용
		
		int year = cal.get(1);//int year = cal.get(Calendar.YEAR); ,상수화
		int month = cal.get(2) + 1;//int month = cal.get(Calendar.MONTH) + 1; // 1월이 0, 2월이 1, ~~~~
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK); //일요일은 1부터 시작 월요일은 2,
		
		String weekOfDay = null; //클래스객체 초기값 null을 줌
		switch(week) {
		case 1 : weekOfDay = "일"; break;
		case 2 : weekOfDay = "월"; break;
		case 3 : weekOfDay = "화"; break;
		case 4 : weekOfDay = "수"; break;
		case 5 : weekOfDay = "목"; break;
		case 6 : weekOfDay = "금"; break;
		case 7 : weekOfDay = "토"; break;
		}
		
		int hour = cal.get(cal.HOUR_OF_DAY);
		int minute = cal.get(cal.MINUTE);
		int second = cal.get(cal.SECOND);
		
		System.out.println(year + "년 " 
						 + month + "월 " 
						 + day + "일 " 
						 + weekOfDay + "요일 "
						 + hour + ":"
						 + minute + ":"
						 + second);
		
	}

}

