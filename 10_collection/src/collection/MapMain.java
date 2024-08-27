package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("book101", "백설공주");
		map.put("book201", "인어공주");
		map.put("book102", "백설공주"); //Value 중복허용
		map.put("book301", "쟈스민");
		map.put("book101", "엄지공주"); //Key 중복허용 , 101찍으면 엄지공주가 나온다. 덮어버려서
		map.put("book401", "덕혜옹주");
		
		System.out.println(map.get("book101"));
		System.out.println(map.get("book301"));
		System.out.println(map.get("book501")); //null
		System.out.println();
		
		for(Map.Entry<String, String> data : map.entrySet()) {
			String key = data.getKey();
			String value = data.getValue();
			
			System.out.println("Key : " + key + "\t Value : " + value);
			
		}//for

	}

}
