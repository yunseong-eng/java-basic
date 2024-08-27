package inheritance;

class AAA {}
class BBB extends AAA {}
//-----------------------
public class InstanceOf {

	public static void main(String[] args) {
		AAA aa = new AAA(); //부모
		BBB bb = new BBB(); //자식, 부모것까지
		AAA aa2 = new BBB(); //부모거까지 잡았지만 부모를 참조하겠다.
		
		
		AAA aa3 = aa; //같은 클래스로 전달하니 된다.
		if(aa instanceof AAA) System.out.println("1. TRUE");
		else System.out.println("1. FALSE");
		
		AAA aa4 = bb; //부모는 모든 자식클래스를 참조 -> 된다.
		if(bb instanceof AAA) System.out.println("2. TRUE");
		else System.out.println("2. FALSE");
		
		BBB bb2 = (BBB)aa2; //자식 = (자식)부모
		if(aa2 instanceof BBB) System.out.println("3. TRUE");
		else System.out.println("3. FALSE");
		
		//BBB bb3 = (BBB)aa; //자식 = (자식)부모 , error 형변환이 안된다.ClassCastException
		if(aa instanceof BBB) System.out.println("4. TRUE");
		else System.out.println("4. FALSE");

	}

}
