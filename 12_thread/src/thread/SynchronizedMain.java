package thread;

class Synchronized extends Thread {
	private static int count;
	
	@Override
	public void run() {
		synchronized (Synchronized.class){ //번호가 순서데로 들어오게끔, 스레드로 들어온 애가 찍고 못나가게끔 해줌 (static count 는 순서데로만 찍기때문에) , 반드시 하나의 스레드만 통과시켜라
			for(int i=1; i<=5; i++) {
				count++;
				System.out.println(Thread.currentThread().getName() + " : " + count); //Thread.currentThread() 현재 스레드가 누군지 	
			}
			
		}
	}
	
}
//---------------------------
public class SynchronizedMain {

	public static void main(String[] args) {
		Synchronized aa = new Synchronized(); //스레드 생성
		Synchronized bb = new Synchronized();
		Synchronized cc = new Synchronized();
		
		aa.setName("aa");
		bb.setName("bb");
		cc.setName("cc"); //이름 생성
		
		//우선순위 
		//1 ~ 10까지 부여
		aa.setPriority(Thread.MIN_PRIORITY);//aa.setPriority(1);
		bb.setPriority(Thread.MAX_PRIORITY);//bb.setPriority(10);
		cc.setPriority(Thread.NORM_PRIORITY);//cc.setPriority(5);
		
		aa.start(); //스레드 시작 -> 스레드 실행(run())
		bb.start();
		cc.start();

	}

}
