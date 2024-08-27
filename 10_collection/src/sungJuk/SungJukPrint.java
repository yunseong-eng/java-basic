package sungJuk; //2번 누르면
//학생 성적정보를 출력하는 클래스, SungJuk 인터페이스를 구현
import java.util.ArrayList;

public class SungJukPrint implements SungJuk {
	
	@Override //출력기능 수행
	public void execute(ArrayList<SungJukDTO>list) {
		System.out.println();
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		for(SungJukDTO sungJukDTO : list) {
			System.out.println(sungJukDTO);
		}//for
	}
}
