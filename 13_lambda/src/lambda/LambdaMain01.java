package lambda;

public class LambdaMain01 {
	
	public void execute(Compute compute) { //인터페이스 Compute를 매개인자로 받음 (구현부)
		int x = 25;
		int y = 36;
		
		compute.calc(x, y); //calc 호출
		
	}

	public static void main(String[] args) {
		LambdaMain01 lambdaMain01 = new LambdaMain01(); //객체생성
		
		lambdaMain01.execute((x, y) -> {  //() -> { }  람다식
			int result = x + y;
			System.out.println(x + " + " + y + " = " + result);
		}); //함수를 호출 
		
		lambdaMain01.execute((x, y) -> {
			int result = x * y;
			System.out.println(x + " * " + y + " = " + result);
		});
		

	}

}
