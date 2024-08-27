package class__;

class StaticTest{ /// ---> default(class 앞에 아무것도 안쓴것)
	int a; //필드((인스턴스변수))(클래스안에 있는것) : 이미 초기화가끝남 0의 값을 갖고있다.(쓰레기값이 없다) , new 생성해야됨(인스턴스변수)
	//new 를 쓸땐 생성자를 꼭 만들어줘야함
	static int b; // 얘는 static 메모리가 잡고있어서 new 안써도됨(클래스변수, 정적변수) , class안에는 있지만 class 소속은 아님
	
	static {
		System.out.println("static 초기화 영역\n"); //처음만 잡히기때문에 여기서 초기화 시켜야됨
		b = 7;           
	}
	//생성자
	public StaticTest() {
		System.out.println("default 생성자");
		this.a = 7; //0으로 시작하지말고 7로 시작하라고 초기화한것
	}
	//인스턴스 메소드 : a와 b를 증가시킴
	public void calc() {
		a++;
		b++;
	}
	//인스턴스 메소드 : a와 b를 출력
	public void disp() {
		System.out.println("a = " + this.a + "\t b = " + StaticTest.b);
	}
	public static void output() {
		System.out.println("static method...");
		//System.out.println("a = " + this.a + "\t b = " + StaticTest.b); //error : static에선 this가 없다.(별도라서 공유변수라서)
	}
	
}
//------------------------
public class StaticMain {

	public static void main(String[] args) {
		//a, b 접근 가능합니까? : 네 가능합니다 ---> default 라서 
		//StaticTest st = new StaticTest();
		//System.out.println("a = " + st.a);
		//System.out.println("b = " + StaticTest.b);

		
		StaticTest aa = new StaticTest(); //new 클래스 생성및 생성자(default) 부르기 , a 가 잡힘 변수값 0
		aa.calc(); //a,b 의 값 1씩 증가 ---> 둘다 0이라 1이됨
		aa.disp(); //a,b는 1이 잡힘
		System.out.println();
		
		StaticTest bb = new StaticTest();
		aa.calc(); //a는 0 b는 static 걸어놔서 1번만 잡혀서 안잡힘---> 2가됨
		aa.disp();
		System.out.println();
		
		StaticTest cc = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		//aa, bb, cc의 a는 이름과 값은 같지만 각자 다른거라고 보는것이 맞다(다른아파트 들의 같은동들)/b는 같은것이다.(아파트들의 공용공원) ---> static(공유변수)
		
		StaticTest.output(); //클래스명.메소드 라고 불러도 호출이가능(static)
		aa.output(); //객체명.메소드 라고 불러도 가능
		
	}

}//class StaticMain











