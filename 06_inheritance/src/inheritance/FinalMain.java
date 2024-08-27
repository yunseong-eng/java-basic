package inheritance;

enum ColorEnum {
	RED, GREEN, BLUE
}
//----------------
class Final {
	public final String FRUIT = "사과"; //상수화
	public final String FRUIT2;
	
	public static final String ANIMAL = "호랑이"; //상수화의 기본
	public static final String ANIMAL2;
	
	//public static final int RED = 0;
	//public static final int GREEN = 1;
	//public static final int BLUE = 2;
	
	static {
		ANIMAL2 = "기린";
	}
	
	public Final() {
		FRUIT2 = "딸기"; //생성자에 초기값 딸기를 줬다.
	}
	
}
//----------------
public class FinalMain {

	public static void main(String[] args) {
		final int AGE = 25;
		//AGE = 30;  - error 변경불가
		System.out.println("AGE = " + AGE);
		
		final String NAME;
		NAME = "홍길동"; //초기값을 안주면 한번의 기회를준다.
		//NAME = "코난"; - error 한번을 초과하면 안돼
		System.out.println("NAME = " + NAME);
		System.out.println();
		
		Final f = new Final();
		System.out.println("FRUIT = " + f.FRUIT);
		System.out.println("FRUIT2 = " + f.FRUIT2);
		System.out.println();
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL2 = " + Final.ANIMAL2);
		System.out.println();
		
		System.out.println("빨강 = " + ColorEnum.RED);
		System.out.println("빨강 = " + ColorEnum.RED.ordinal()); //안에 숨어있는 값을 보여줌
		System.out.println();
		
		for(ColorEnum data : ColorEnum.values()) { 
			System.out.println(data.ordinal() + " : " + data);
		}
		
	}

}
