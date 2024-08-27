package basic;

public class Variable2 {
	int a; //필드, 이미 초기화 되어있다(0으로) (class소속(필드소속)이라 a를 써도 error가 안난다
	static int b;
	static String c; //클래스 타입의 초기값은 null
	
	//c "apple"; error, 함수안에 써야한다
	
	public static void main(String[] args) {
		int a = 100; // local variable(지역변수), 쓰레기값 , 초기화 시켜줘야한다
		System.out.println(a);
		
		//int a; ---- error(a가 중복)
		
		System.out.println("필드 a = " + new Variable2().a);
		
		//System.out.println("필드 b = " + b);
		System.out.println("필드 b = " + Variable2.b);
		
		//c = "apple"; //리터럴 생성
		c = new String("apple");
		
		System.out.println("필드 c = " + c);

	}

}
