package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
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
	
	@Override
	public String toString() {
		return name;
	}
	
}
//---------------
/*public class StreamMain03 {

	public static void main(String[] args) {
		List<Person> list = Arrays.asList(new Person("lee",26),
											 new Person("kim", 23),
											 new Person("park", 23));

		//.collect - 스트림의 요소를 원하는 자료형으로 변환
		
		// toList() -  Stream을 List로 변환
		list.stream()
			   .map(Person::getName)
		       .collect(Collectors.toList()); 
		System.out.println(list);// [lee, kim, park]
		
		
		// joining() - 작업 결과를 하나의 스트링으로 이어 붙이기
		list.stream()
		    .map(Person::getName)
	        .collect(Collectors.joining(delimiter = "+" , prefix = "<", suffix = ">");
	    // <lee+kim+park>
	        
	      //groupingBy() - 그룹지어서 Map으로 반환
	        members.stream()
	        	.collect(Collectors.groupingBy(Person::getAge));
	        	// {26 = [Person{lastName="lee",age=26}],
	            //  23 = [Person{lastName="kim",age=23},Person{lastName="park",age=23}]}
	            
	        //collectingAndThen() - collecting 이후 추가 작업 수행
	        members.stream()
	        	.collect(Collectors.collectingAndThen (Collectors.toSet(),
	            									   Collections::unmodifiableSet));
	        	//Set으로 collect한 후 수정불가한 set으로 변환하는 작업 실행
	        
	        //Matching
	        //특정 조건을 만족하는 요소가 있는지 체크한 결과를 반환
	        List<String> members = Arrays.asList("Lee", "Park", "Hwang");
	        boolean matchResult = members.stream()
	        						.anyMatch(members->members.contains("w")); //w를 포함하는 요소가 있는지, True

	        boolean matchResult = members.stream()
	        						.allMatch(members->members.length() >= 4); //모든 요소의 길이가 4 이상인지, False

	        boolean matchResult = members.stream()
	        						.noneMatch(members->members.endsWith("t")); //t로 끝나는 요소가 하나도 없는지, True
	        
	        forEach로 스트림을 돌면서 실행되는 작업

	        members.stream()
	        	.map(Person::getName)
	            .forEach(System.out::println);
	            //결과를 출력 (peek는 중간, forEach는 최종)
	        Finding
	        스트림에서 하나의 요소를 반환

	        Person person = members.stream()
	        					.findAny()   //먼저 찾은 요소 하나 반환, 병렬 스트림의 경우 첫번째 요소가 보장되지 않음
	                            .findFirst() //첫번째 요소 반환

	}

}

/*
 * Arrays.asList()
Arrays.asList()는 고정된 List로 원소를 추가하거나 삭제할 수 없다.
하지만 List의 원소 값을 변경할 수는 있다.
set() 메서드를 통해 특정 인덱스의 원소 값을 변경할 수 있다.
 */










