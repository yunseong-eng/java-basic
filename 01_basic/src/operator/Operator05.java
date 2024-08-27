package operator;

public class Operator05 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a);
		System.out.println();
		
		String b = "apple"; //b라는 변수 방에 apple 주소가 반영
		String c = "apple"; // 그런데 같은 apple이 들어갈수가없다
		String d = new String("apple");
		
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); //주소비교
		System.out.println("b == d : " + (b == d ? "같다" : "다르다"));
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다")); //문자열 자체를 비교
		System.out.println("b.equals(d) : " + (b.equals(d) ? "같다" : "다르다")); //문자열 자체를 비교
		System.out.println();
	
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "같다" : "다르다"));
		System.out.println("!b.equals(d) : " + (!b.equals(d) ? "같다" : "다르다"));
		System.out.println();


	}

}
