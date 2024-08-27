package thread;

public class SnackMain extends Thread { //스레드를 위해 상속받기
	private String str;
	
	public SnackMain(String str) {
		this.str = str;
	}
	
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println(str+"\t"+"i="+i+"\t"+Thread.currentThread()); //Thread.currentThread 현재 스레드가 누가 들어왔는지 찍어주라
		}
	}

	public static void main(String[] args) {
		SnackMain aa = new SnackMain("새우깡"); //스레드를 생성
		SnackMain bb = new SnackMain("포카칩"); //스레드를 생성
		SnackMain cc = new SnackMain("수미칩"); //스레드를 생성
		
		aa.setName("새우깡"); //스레드 이름 수정
		bb.setName("포카칩");
		cc.setName("수미칩");
		
		//스레드를 시작 -> 운영체제가 알아서 스레드를 실행시킨다. (운영체제가 알아서  run()  호출) - run메소드 실행 -> 콜백메소드(Call Back))
		aa.start(); 
		
		try {
			aa.join();  //스레드를 깨버리는것.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		bb.start();
		cc.start();
		
	
	}

}

//새우깡을끝내야 그다음 포카칩, 수미칩 (새우깡 5개 -> 포카칩 5개 -> 수미칩 5개)
//so 스레드 시켜줌 그럼 섞임


