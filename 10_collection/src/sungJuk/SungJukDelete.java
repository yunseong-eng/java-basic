package sungJuk;
//학생 성적정보를 삭제하는 클래스, SungJuk 인터페이스를 구현
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {
	
	@Override //삭제기능 수행
	public void execute(ArrayList<SungJukDTO>list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		int count=0; //삭제된 항목 개수
		
		/* - error
		for(SungJukDTO sungJukDTO : list) {
			if(sungJukDTO.getName().equals(name)) {
				list.remove(sungJukDTO);
				count++;
			}
		}//for
		*/
		
		//Iterator it = new Iterator();	 - error 
		//Iterator를 얻는다.
		Iterator<SungJukDTO> it = list.iterator();
		
		//순회 할 다음요소가 있는동안 반복
		while(it.hasNext()) {
			SungJukDTO sungJukDTO = it.next(); //다음 요소를 가져옴
			
			//입력받은 이름과 일치하는지 확인
			if(sungJukDTO.getName().equals(name)) {
				it.remove(); //일치하면 제거
				count++; //삭제된 항목 개수증가
			}
		
		}
		
		//it.next() - 항목을 꺼내고 버퍼(임시공간)에 보관하고, 다음으로 이동한다.
		//it.remove() - it.next() 통해서 임시공간에 보관한 항목을 제거합니다.
		
		if(count == 0)
			System.out.println("회원의 정보가 없습니다");
		else
			System.out.println(count + "건의 항목을 삭제하였습니다");
		
	}

}
