package basic;

public class HellowTest {

	public static void main(String[] args) {
			//"안녕하세요" 문자열 출력
			System.out.println("안녕하세요");
			System.out.println();
			// 'A'의 ASCII코드 값 65 + 32 = 97
			System.out.println('A' + 32);
			System.out.println((char)('A' + 32));
			System.out.println();
			
			System.out.println(2 + 3);
			//2의 ASCII코드 값 50 + 51
			System.out.println('2' + '3'); //101
			
			//결과가 5가 나오도록 하시오
			System.out.println('2' - 48 + '3' - 48);
			
			System.out.println("2" + "3"); //23
			
			//결과가 5가 나오도록 하시오
			//Integer.parseInt --> 정수로 변환
			System.out.println( Integer.parseInt("2") + Integer.parseInt("3"));
			System.out.println();
			
			System.out.println("12.5" + "36.8");
			
			//결과가 49.3가 나오도록 하시오
			System.out.println(Double.parseDouble("12.5") + Double.parseDouble("36.8"));
	}

}
