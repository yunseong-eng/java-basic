package inheritance; //자식

public class SubMain extends Super { //extends-> 상속문
	private String name;
	protected int age;
	
	public SubMain() {
		System.out.println("SubMain 기본 생성자");
	}
	public SubMain(String name, int age, double weight, double height) {
		//3. 부모 생성자 호출 (단 본인도 생성자여야한다.)
		super(weight, height);
		
		System.out.println("SupMain 생성자");
		
		this.name = name; //this -> 나
		this.age = age;
		//1.
		//this.weight = weight; 
		//this.height = height; //내것도 내꺼 부모것도 내꺼
		
		//2.
		//super.weight = weight; //super -> 부모
		//super.height = height;
		
	}
	
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		//System.out.println("몸무게 = " + weight);
		//System.out.println("키 = " + height);
		
		disp();//호출 , 앞에 Super 생략
			
	}
	
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25, 85.3, 178.6); //aa -> SubMain, Super 꺼까지
		aa.output();
		System.out.println();
		
		aa.disp(); //먼저 내꺼에서 찾고 없으면 Super에서 찾음
		System.out.println("---------------------");
		
		Super bb = new SubMain("코난", 13, 35.8, 156.7); //Super만 참조 so SubMain은 못가져온다.
		//bb.output(); - error
		bb.disp();
		
	}
	

}
