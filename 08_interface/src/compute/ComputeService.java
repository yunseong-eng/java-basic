package compute;

import java.util.Scanner;

public class ComputeService {

	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num = 0; //선택한 메뉴 번호저장 변수
		Compute com = null;//부모를 잡아옴, 부모는 new 할 필요없음
		
		while(true) {
			System.out.println();
			System.out.println("*****************");
			System.out.println("    1.합");
			System.out.println("    2.차");
			System.out.println("    3.곱");
			System.out.println("    4.몫");
			System.out.println("    5.끝내기");
			System.out.println("*****************");
			System.out.print("    번호 : ");
			num = scan.nextInt(); //메뉴번호 입력받기
			
			if(num == 5) break;
			//선택한 번호에 따라 각각의 연산 클래스 객체 생성
			if(num == 1) 
			    com = new Sum();//생성을 해야 Sum 클래스로 갈수있다.
			else if(num == 2) 
				com = new Sub();
			else if(num == 3) 
				com = new Mul();
			else if(num == 4) 
				com = new Div();
			
			//연산 실행
			com.execute();
			
		}
		
	}//menu()
}
