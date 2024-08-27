package inheritance;
//AA와 BB는 상속관계
class AA {
	int a = 3; //public 을 안쓰면 default로 잡힘
	public void disp() {
		a += 5;
		System.out.print("AA : "+ a + " ");
	}
}
//----------------------
class BB extends AA {
	int a = 8;
	public void disp() {
		this.a += 5;
		System.out.print("BB : " + a + " ");
	}
}
//-----------------------
public class TestMain {

	public static void main(String[] args) {
		BB aa = new BB();
		aa.disp(); // BB : 13
		System.out.println("aa : " + aa.a); // 13
		
		AA bb = new BB(); //자식쪽을 부모가 참조 -> 다형성 , 참조값 BB가 AA를 가르킴
		bb.disp(); // BB : 13
		System.out.println("bb : " + bb.a); //3, 오버라이드는 메소드에게만 해당사항이 들어감
		System.out.println();
		
		//부모는 자식클래스를 참조할수있는 다형성
		//자식은 부모클래스를 참조할수 없어서 casting을 걸어줘야함 ((자식 = (자식)부모 -> BB cc = (BB)bb;))
		BB cc = (BB)bb;
		cc.disp(); //기존의 a값 13에 5를 더해서 18이됨
		System.out.println("cc : " + cc.a); //18
		
		AA dd = new AA();
		dd.disp();//AA : 8 , 단독으로 부모클래스를 잡으면 부모만 잡힘
		System.out.println("dd : " + dd.a);//8
		System.out.println();
		
		BB ee = (BB)dd; //자식 = (자식)부모 , error - BB로 형변환 할수없다(메모리에 BB클래스가 없어서) ClassCastException
		
		

	}

}
