package thread;

class JoinTest implements Runnable { //인터페이스는 상속처럼보이지만 상속이아니다. (스레드가 아니다)

	@Override //Override 는 throws를 못건다. (throws를 걸면 부모의 Runnable에 가서도 걸어줘야하는데 못하기때문)
	public void run() { //Call-Back
		for(int i=1; i<=5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000); //단위는 1/1000초 , 1000을 주면 1초간 딜레이됨
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}//for
		
		
	}
	
}
//---------------------------------------------------------------------------
public class JoinMain {

	public static void main(String[] args) {
		JoinTest joinTest = new JoinTest();
		Thread t = new Thread(joinTest); //joinTest를 스레드로 만들어주세요.
		
		System.out.println("스레드 시작"); 
		t.start(); //스레드를 시작 -> 운영체제가 알아서 스레드를 실행시킨다.
		try {
			t.join(); //스레드 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("스레드 종료");

	}

}


//메인이 끝나도 스레드는 종료되지않는다. 
//메인이 끝나도 백그라운드에서 스레드는 돌아간다.