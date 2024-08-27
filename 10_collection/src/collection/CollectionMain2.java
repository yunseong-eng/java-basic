package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		//<String> 제네릭 타입 지정 String만 추가 가능
		ArrayList<String> list = new ArrayList<String>();
		list.add("호랑이"); //문자열 "호랑이" 추가
		list.add("사자");
		list.add("호랑이"); //중복허용
		//list.add(25);
		//list.add(43.8);
		list.add("기린");
		list.add("코끼리");
		
		//리스트요소 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		
		//향상된 for문을 사용해서 리스트요소 출력
		for(String data : list) {
			System.out.println(data);
		}

	}

}
