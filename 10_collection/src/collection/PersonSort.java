package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		//문자열 배열 정렬 
		String[] ar = {"Orange", "apple", "banana", "pear", "peach", "applemango"};
		
		System.out.print("정렬 전 = ");
		for(String data : ar) {
			System.out.print(data+"  ");
		}
		System.out.println();
		
		//배열 정렬
		Arrays.sort(ar);
		
		System.out.print("정렬 후 = ");
		for(String data : ar) {
			System.out.print(data+"  ");
		}
	    System.out.println();
	    
	    //객체 비교
	    PersonDTO aa = new PersonDTO("홍길동",25);
		PersonDTO bb = new PersonDTO("프로도",40);
		PersonDTO cc = new PersonDTO("라이언",30);
		
		ArrayList<PersonDTO> list = new ArrayList<PersonDTO>();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		
		System.out.println("[정렬 전]");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		//리스트 정렬
		Collections.sort(list);
		
		System.out.println("[정렬 후]");
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
		
		
		System.out.println("[정렬 후] - 이름으로 내림차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {
			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				return p1.getName().compareTo(p2.getName()) * -1;
			}
		};
		
		Collections.sort(list, com);
		
		for(PersonDTO personDTO : list) {
			System.out.println(personDTO);
		}
		System.out.println();
			
	}

}
