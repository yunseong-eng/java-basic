package nested;

public abstract class AbstractTest { //추상클래스 라고 해서 모든 메소드가 추상이여야 하는건 아니다.
	String name;

	public String getName() {
		return name;
	}

	public abstract void setName(String name); //추상메소드, 반드시 추상클래스여야한다. 
	

	
}
