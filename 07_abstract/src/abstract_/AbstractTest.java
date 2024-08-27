package abstract_;
//추상 클래스 선언
public abstract class AbstractTest {
    String name; //이름을 저장 할 필드
	
	public AbstractTest() {} //기본생성자
	
	//매개변수가 있는 생성자
	public AbstractTest(String name) {
		super();
		this.name = name;
	}
	
	// name 필드의 값을 반환하는 메서드 (구현된 메소드)
	public String getName() { 
		return name;
	}
	
	// name 필드의 값을 설정하는 추상 메소드 (구현은 서브클래스에서)
	//추상메소드 , 추상메소드를 가지면 class도 추상 class 이어야한다.
	public abstract void setName(String name);  
	
}

	


