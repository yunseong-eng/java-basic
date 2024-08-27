package compute;

public class ComputeMain {

	public static void main(String[] args) {
		//ComputeService 객체생성
		ComputeService computeService = new ComputeService();
		computeService.menu();//메뉴실행
		System.out.println("프로그램을 종료합니다.");

	}

}
