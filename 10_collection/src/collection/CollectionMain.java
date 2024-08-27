package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionMain {
	
	@SuppressWarnings("all") //노란줄 내보내지마!
	public static void main(String[] args) {
		//Collection coll = new Collection(); // interface는 new로 인스턴스를 생성할수 없다.
		Collection coll = new ArrayList(); // 대신 Override 해줄 클래스 ArrayList로 인스턴스를 생성
		coll.add("호랑이");
		coll.add("사자");
		coll.add("호랑이"); //중복허용
		coll.add(25);
		coll.add(43.8);
		coll.add("기린");
		coll.add("코끼리");
		
		//컬렉션의 요소를 반복할 Iterator 생성
		Iterator it = coll.iterator();
		while(it.hasNext()) { //항목이 없을때까지 반복해라
			System.out.println(it.next());
			
		}


	}

}
