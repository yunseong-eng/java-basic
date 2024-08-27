package collection;

public class GenericMain2<T> {
    private T a; //자료형을 몰라요~
    
	public GenericMain2(T a) {
		this.a = a;
	}
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}

	public static void main(String[] args) {
		//GenericMain2<?> aa = new GenericMain2<String>();
		//aa.setA("홍길동"); // - error, 반드시 데이터는 setter가 아니라 생성자를 통해서 넣어야 한다.
		
		GenericMain2<?> aa = new GenericMain2<String>("홍길동");
		String name = (String)aa.getA(); // -> Object 타입으로 받아서 형변환 해줘야한다.
		System.out.println("이름 = " + name);
		
		GenericMain2<?> bb = new GenericMain2<Integer>(25);
		//int age = (int) bb.getA();
		int age = (Integer) bb.getA(); //-> Integer 을 써도 에러가 안난다. (unAutoBoxing)
		System.out.println("나이 = " + age);
		
	}

}
