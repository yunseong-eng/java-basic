package lambda;

class Persono02 {
	public void execute(Workable workable) { //메소드 구현
		workable.work(); //work 함수 호출
	}
}
//-----------------------
public class LambdaMain02 {

	public static void main(String[] args) {
		Persono02 persono02 = new Persono02();
		
		persono02.execute(() -> {
			System.out.println("안녕하세요");
			System.out.println("나의 이름은 홍길동 입니다.");
		}); // execute 호출
		
		//처리하는 실행문이 한개일 경우 {}를 생략할수있다 , for문과 같다.
		persono02.execute(() -> System.out.println("반갑습니다."));

	}

}
