package thread;

class Singleton {
	private int num=3;
	private static Singleton instance;
	
	public static Singleton getInstance() {
		if(instance == null) { //인스턴스가 null인 경우만 인스턴스 생성
			synchronized (Singleton.class) { //여러 스레드가 동시에 접근할때 인스턴스가 여러번 생성되는것을 방지하기 위해 동기화
				instance = new Singleton(); //인스턴스 생성
				
			}
		}
		
		return instance; //이미 생성된 인스턴스를 반환
	}
	
	public void calc() {
		num++;
	}
	
	public void disp() {
		System.out.println("num = " + num);
	}
}
//------------------------
public class SingletonMain { //Singleton -> 객체를 한번만 만들어서 쓰겠다 

	public static void main(String[] args) {
/*      
        Singleton aa = new Singleton(); //aa 객체 
		aa.calc(); //4
		aa.disp();
		System.out.println();
		
		Singleton bb = new Singleton();
		bb.calc(); //4
		bb.disp();
		System.out.println();
		
		Singleton cc = new Singleton();
		cc.calc(); //4
		cc.disp();
		System.out.println();
*/
		
		Singleton aa = Singleton.getInstance(); // Singleton 인스턴스 aa 얻기
		aa.calc(); //4
		aa.disp();
		System.out.println();
		
		Singleton bb = Singleton.getInstance();
		bb.calc(); //5
		bb.disp();
		System.out.println();
		
		Singleton cc = Singleton.getInstance();
		cc.calc(); //6
		cc.disp();
		System.out.println();
	}

}
