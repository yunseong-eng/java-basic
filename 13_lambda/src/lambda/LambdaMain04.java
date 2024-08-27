package lambda;

class Person04 {
	public void execute(Compute02 compute02) { //execute 구현
		String result = compute02.calc(25, 36);
		System.out.println(result);
	}
	
	public int mul(int x, int y) {
		return x * y;
	}
	
	public double div(int x, int y) {
		return (double)x / y; //정수형 나누기 정수형은 정수만 나와서 double 형으로
	}
}
//---------------
public class LambdaMain04 {

	public static void main(String[] args) {
		Person04 person04 = new Person04();
		
		person04.execute((x, y) -> {
			int result = x + y;
			return x + " + " + y + " = " + result; 
		});
		
		person04.execute((x, y) -> {
			return x + " + " + y + " = " + (x+y); //위 두줄을 한줄로
		});
		
		//실행문이 1개일경우 {} 와 함께 return도 생략할수있다.
		person04.execute((x, y) -> x + " + " + y + " = " + (x+y));
		
		person04.execute((x, y) -> x + " - " + y + " = " + (x-y));
		
		person04.execute((x, y) -> x + " * " + y + " = " + person04.mul(x, y));
		
		person04.execute((x, y) -> x + " / " + y + " = " + person04.div(x, y));
	
	
	}

}
