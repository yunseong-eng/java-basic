package collection;

public class PersonDTO extends Object implements Comparable<PersonDTO>{ //extends Object 생략
	private String name;
	private int age;
	
	//기본생성자
	public PersonDTO() {	
	}
	
	//매개변수가 있는 생성자
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//객체를 문자열로 표현하는 메소드
	@Override
		public String toString() {
			return "이름 = " + name + "\t 나이 = " + age;
		}
	
	//PersonDTO 객체를 비교하는 메소드
	@Override
	public int compareTo(PersonDTO p) {
		
		//나이로 오름차순을 시켜보자
		if(this.age < p.age) return -1;
		else if(this.age > p.age) return 1;
		else return 0;
		
		
		//나이로 내림차순
		/*
		if(this.age < p.age) return 1;
		else if(this.age > p.age) return -1;
		else return 0;
		
		*/
		//이름으로 오름차순
		//return this.name.compareTo(p.name);
		
		//이름으로 내림차순
		//return this.name.compareTo(p.name) * -1;
		
	}
    
}
