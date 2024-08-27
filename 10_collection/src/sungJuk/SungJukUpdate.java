package sungJuk;
//학생 성적정보를 수정하는 클래스, SungJuk 인터페이스를 구현
import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {
	
	@Override //수정기능 수행
	public void execute(ArrayList<SungJukDTO>list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("번호 입력 : ");
		int no = scan.nextInt(); //수정 할 번호 입력받기
		
		boolean sw = false; //번호 존재 여부 확인 변수
		
		for(SungJukDTO sungJukDTO : list) {
			if(sungJukDTO.getNo() == no) {
				System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
				System.out.println(sungJukDTO);
				System.out.println();
				
				System.out.println("수정 할 이름 입력 : ");
				String name = scan.next();
				System.out.println("수정 할 국어 입력 : ");
				int kor = scan.nextInt();
				System.out.println("수정 할 영어 입력 : ");
				int eng = scan.nextInt();
				System.out.println("수정 할 수학 입력 : ");
				int math = scan.nextInt();
				
				//정보 수정 및 총점,평균 재계산
				sungJukDTO.setName(name);
				sungJukDTO.setKor(kor);
				sungJukDTO.setEng(eng);
				sungJukDTO.setMath(math);
				sungJukDTO.calc();
				
				System.out.println("수정하였습니다.");
				
				sw = true; //번호 존재여부 확인
				break;
				
			}//if
		}//for
		
		if(!sw) System.out.println("잘못된 번호 입니다.");
		
	}

}
