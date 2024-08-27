package class__;

public class StringMain {
	
	public StringMain() {
		String aa = "apple";
		String bb = "apple"; //이것도 가능
		if(aa==bb)System.out.println("aa와 bb의 참조값은 같다");
		else System.out.println("aa와 bb의 참조값은 다르다");
		
		if(aa.equals(bb))System.out.println("aa와 bb의 문자열은 같다");
		else System.out.println("aa와 bb의 문자열은 다르다");
		System.out.println();
		
		String cc = new String("apple");
		String dd = new String("apple"); //new도 가능
		if(cc==dd)System.out.println("aa와 dd의 참조값은 다르다");
		else System.out.println("cc와 dd의 참조값은 다르다");
		
		if(cc.equals(dd))System.out.println("cc와 dd의 문자열은 같다");
		else System.out.println("cc와 dd의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2023 + 12 + 29;
		System.out.println("e = " + e);
		
		/*
		"오늘 날짜는 "
		"오늘 날짜는 2023"
		"오늘 날짜는 202312"
		e ---> "오늘 날짜는 20231229"
		
		메모리가 꽉 차서 더 생성이 안된다.
		-> JVM에 의해서 휴지통(Garbage Collector)으로 보낸다.
		-> JVM에 의해서 휴지통(Garbage Collector)으로 보내는 동안은 컴퓨터는 작동을 멈춘다.
		*/ 
		
		System.out.println("문자열 크기 = " + e.length());
		
		System.out.println("5번째 위치의 문자 = " + e.charAt(5)); //는
		
		System.out.println("부분 문자열 추출 = " + e.substring(7)); //7번부터 쭉 가져옴
		System.out.println("부분 문자열 추출 = " + e.substring(7,11)); //7번부터 10번까지 가져옴
		
		System.out.println("대문자 변경 = " + "Hello".toLowerCase()); //전부 대문자
		System.out.println("소문자 변경 = " + "Hello".toLowerCase()); //전부 소문자
		
		System.out.println("문자열 검색 = " + e.indexOf("짜")); //짜라는 글씨가 있는지 찾아라(4번)
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));//날짜를 찾아라
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); //없으면 -1을 보내준다
		
		System.out.println("문자열 치환 = " + e.replace("날짜", "일자"));//날짜를 일자로 바꿔라
		 
	}

	public static void main(String[] args) {
		new StringMain();

	}

}
