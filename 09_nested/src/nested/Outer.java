package nested;

public class Outer {
	private String name;
	
	public void output() {
		//private 라서 getAge라고 안써줘도된다.
		System.out.println("이름 = " + this.name + "\t나이 = " + new Inner().age); //age를 가져오기 위해 객체를 만들어줌(일시적)
	}
	
	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이 = " + this.age); 
		}
		
	}//class Inner

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.name = "홍길동";
		outer.output();
		System.out.println();
		
		Outer.Inner inner = outer.new Inner();
		inner.age = 25;
		inner.disp();
		System.out.println();
		
		Outer.Inner inner2 = outer.new Inner();
		inner2.age = 30;
		inner2.disp();
		System.out.println();
		
		Outer.Inner inner3 = new Outer().new Inner(); //주인 없는 공터에 방 만들고싶다.
		//inner3.name = "코난"; - error 범위 밖이라 못불러옴 
		inner3.age = 35;
		inner3.disp();

	}

}//class Outer
