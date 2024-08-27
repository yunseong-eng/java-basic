package collection;

import java.util.ArrayList;

public class PersonMain {
	
	//PersonDTO 객체들을 초기화 하는 메소드
	public ArrayList<PersonDTO> init() {
		PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("라이언",30);
		
		//ArrayList 생성해서 aa,bb,cc를 한번에 리턴
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		return list;
		
	}
	//---------------------
	public static void main(String[] args) {
		PersonMain main = new PersonMain();
		
		//init 메소드로 리스트 초기화
		ArrayList<PersonDTO> list = main.init();
		System.out.println(list);
		
		//리스트 요소를 반복문으로 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getName() + "\t" + list.get(i).getAge());
			
		}
		System.out.println();
		
		//향상된 for문으로 출력
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
		}
		System.out.println();
		
		//toString 메소드로 출력
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		
		
		
	
		
		/*
		PersonDTO personDTO = new PersonDTO();
		System.out.println("객체 personDTO = " + personDTO); //toString 생략
		System.out.println("객체 personDTO = " + personDTO.toString());
		
		personDTO.setName("홍길동");
		personDTO.setAge(25);
		System.out.println("이름 = " + personDTO.getName() + "\t 나이 = " + personDTO.getAge());
		System.out.println(personDTO);
		*/
		

	}

}
