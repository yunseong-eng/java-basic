package class_;

public class Person {
	private String name; //필드, 초기화
	private int age;
	
	public void setName(String n) { //구현
		name = n;
	}
	public void setAge(int a) { 
		age = a;
	}
	public void setData(String n, int a){ 
		name = n;
		age = a;
	}
	public void setData() {} 
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

}
