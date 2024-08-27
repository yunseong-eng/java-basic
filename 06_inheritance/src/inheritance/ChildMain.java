package inheritance;

public class ChildMain extends Super {
	private String name;
	protected int age;
	
	public ChildMain() {
		System.out.println("ChildMain의 기본생성자");
	}
	
	public ChildMain(String name, int age, double weight, double height) {
		super(weight, height);
		
        System.out.println("ChildMain 생성자");
		
		this.name = name; 
		this.age = age;
		
	}
	
	public void disp() { //Super한테도 disp가 있지만 에러 안난다. 
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		
		//disp(); // 자기꺼한테 감 Overrid
		super.disp();
		
	}

	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 25, 85.3, 178.6);
		aa.disp();
		
		System.out.println("---------------------");
		
		Super bb = new ChildMain("코난", 13, 35.8, 156.7); 
		bb.disp();

	}

}
