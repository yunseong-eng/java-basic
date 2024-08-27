package stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("이제훈");
		list.add("엄태구");
		list.add("이동욱");
		list.add("안효섭");
		list.add("이준기");
		list.add("나인우");
		
		for(int i=0; i<list.size(); i++) { //외부 반복 , 꺼내온 다음에 처리하겠다.
			System.out.println(list.get(i));
		}
		System.out.println();
		
		Iterator<String> it = list.iterator(); //외부 반복
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		Stream<String> stream = list.stream(); //컬랙션 안에서 반복(내부반복)
		//stream.forEach(name -> System.out.println(name)); //람다식 처리 
		stream.forEach(System.out :: println);
		
	}

}

/*
스트림(Stream)
스트림(Stream)은 자바 8 API에 새로 추가된 기능이다.
람다를 활용해 배열과 컬렉션을 함수형으로 간단하게 처리할 수 있는 기술이다.
*/