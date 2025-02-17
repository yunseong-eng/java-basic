package lambda;

class Calculator {
	public static String staticMethod(int x, int y) {
		return x + " + " + y + " = " + (x+y);
	}
	
	public String non_staticMethod(int x, int y) {
		return x + " * " + y + " = " + (x*y);
	}
}
//----------------------
public class LambdaMain05 {

	public static void main(String[] args) {
		Person04 person04 = new Person04();
		
		person04.execute((x, y) -> Calculator.staticMethod(x, y)); //static이라 클래스명으로 바로접근
		person04.execute(Calculator :: staticMethod); //위에거와 동일
		
		Calculator calculator = new Calculator();
		person04.execute((x, y) -> calculator.non_staticMethod(x, y));
		person04.execute(calculator :: non_staticMethod);
		

	}

}

/*
메소드를 참조해서 매개변수의 정보 및 리턴 타입을 알아내 람다식에서 불필요한 매개변수를 제거하는 것을 목적으로 한다.

큰수를 리턴하는 람다식
(x, y) -> Math.max(x, y);

위에서 단순히 x, y 값을 매개값으로 전달하는 역활만 하기 때문에 메소드 참조를 이용하면 깔끔하게 처리된다.
Math :: max;

[형식]
① 정적 메소드
클래스 :: 메소드

② 인스턴스 메소드
참조변수 :: 메소드

*/
