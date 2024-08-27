package inheritance;

class Test {  //extends Object 생략
	
	@Override
	public String toString() {
		return getClass() +  "@개바부"; //클래스명 @개바부 
	}
	
}
//--------------
public class ObjectMain {

	public static void main(String[] args) {
		Test test = new Test();
		System.out.println("객체 test = " + test); //클래스명@16진수
		System.out.println("객체 test = " + test.toString()); //같음
		System.out.println("객체 test = " + test.hashCode()); //16진수값을 10진수로 보여줌
		System.out.println();
		
		String str = "apple";
		System.out.println("객체 str = " + str); //클래스명@16진수 ==> 문자열
		System.out.println("객체 str = " + str.toString());
		System.out.println("객체 str = " + str.hashCode()); //--> 믿지마셈
		System.out.println();
		
		String aa = new String("apple");
		String bb = new String("apple");
		System.out.println("aa==bb : " + (aa==bb)); //참조값 비교 , false
		System.out.println("aa.equals(bb) : " + aa.equals(bb)); //문자열 비교, true
		System.out.println();
		
		Object cc = new Object();
		Object dd = new Object();
		System.out.println("cc==dd : " + (cc==dd)); //참조값 비교 , false
		System.out.println("cc.equals(dd) : " + cc.equals(dd)); //참조값 비교, false
		System.out.println();
		
		Object ee = new String("apple");
		Object ff = new String("apple");
		System.out.println("ee==ff : " + (ee==ff)); //참조값 비교 , false
		System.out.println("ee.equals(ff) : " + ee.equals(ff)); //문자열 비교, true , Overriding 되어있어서 자식한테 떨어짐
		System.out.println();
		
		//Object에서는 == , equals() 가 모두 참조값(reference) 만으로 비교한다.
		//단, String만이 equals()가 내용(문자열)을 비교한다.
		
		
		
		
		
		

	}

}

/*
class Object {
	public boolean equals(Object obj){} //참조값 비교
	public String toString(){} 클@16진수
	public int hashCode(){} //10진수
}

class String extends Object {
	public boolean equals(Object obj){} //문자열 비교
	public String toString(){} //문자열
	public int hashCode(){} //믿지마삼, 표현 할 수 있는 문자열은 무한대이기 때문에 10진수 표현을 할 수 없다.
}
	
*/
