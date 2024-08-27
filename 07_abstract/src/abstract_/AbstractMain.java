package abstract_;
//AbstractTest 추상 클래스를 상속받은 클래스
public class AbstractMain extends AbstractTest {
	
	// 추상 메소드를 구현 (name 필드를 설정하는 메소드)
	@Override
	public void setName(String name) {
		this.name = name;
	}
	

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); - error 추상클래스라 생성이안된다.
		
		// 부모 타입 참조 변수에 자식 클래스 인스턴스 할당 (다형성)
		AbstractTest at = new AbstractMain();//부모 = 자식
		
		at.setName("홍길동");
		System.out.println("이름 = " + at.getName());
		
		//at.setName("홍길동"); //호출 
	}


}
