package class__;

public class Constructor01 {
	private String name;
	private int age;
	
	public Constructor01() {
		System.out.println("기본 생성자");
		System.out.println("this = " + this);
	}
	
	public Constructor01(String name) {
		this();
		System.out.println("Constructor01(String name)");
		this.name = name;
	}
	
	public Constructor01(int age) {
		this("코난"); //Overload된 생성자 호출, 첫번째 줄에 써야된다
		System.out.println("Constructor01(int age)");
		this.age = age;
	}
	
	public static void main(String[] args) {
		Constructor01 aa = new Constructor01();
		System.out.println("aa = " + aa);
		System.out.println(aa.name + ", " + aa.age);
		System.out.println();
		
		Constructor01 bb = new Constructor01("홍길동");
		System.out.println(bb.name + ", " + bb.age);
		System.out.println();
		
		Constructor01 cc = new Constructor01(25);
		System.out.println(cc.name + ", " + cc.age);
		System.out.println();
		
	}

}
