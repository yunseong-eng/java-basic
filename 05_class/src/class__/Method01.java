package class__;

public class Method01 {

	public static void main(String[] args) {
		//static 메소드 호출 - static 일경우 클래스명.메소드명을 써주면됨
		Method01.display(); 
		display(); //내 구역안에서는 클래스명을 빼도됨
		
		Method01 m = new Method01();
		m.output();
		m.display();

	}
	
	public static void display() { //구현    
		System.out.println("static method");
	}
	
	public void output() { //구현
		System.out.println("non-static method");
		
	}
}
