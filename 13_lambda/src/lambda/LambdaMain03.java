package lambda;

class Person03 {
	public void execute(InterA interA) {
		interA.disp("홍길동", 25);
	}
	
	public void execute(InterB interB) {
		interB.output("안녕하세요 홍길동 입니다");
	}
}

//-------------------
public class LambdaMain03 {

	public static void main(String[] args) {
		Person03 person03 = new Person03(); //execute를 끌고오기위해 객체생성
		
		person03.execute((name, age) -> {
			System.out.println("나의 이름은 " + name + " 입니다");
			System.out.println("내 나이는 " + age + "살 입니다");
		});
		
		//매개변수가 1개일 경우에는 {} 생략가능
		person03.execute((data) -> System.out.println(data));

	}

}
