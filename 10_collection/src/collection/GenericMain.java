package collection;

public class GenericMain<T> { //Generic 검
	private T a; //자료형을 몰라요~
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}

	public static void main(String[] args) {
		 //GenericMain<String> aa = new GenericMain<String>();
		GenericMain<String> aa = new GenericMain(); //생략가능
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
		
		//aa.setA(25); - error 문자열로 걸어서 다른타입이 안된다.
		
		GenericMain<Integer> bb = new GenericMain<>(); //정수형 타입으로 
		bb.setA(25);
		System.out.println("나이 = " + bb.getA());
		
	}

}
