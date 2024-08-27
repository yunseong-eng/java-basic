package sungJuk;
//학생 성적정보를 정렬하는 클래스, SungJuk 인터페이스를 구현
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
//SungJuk interface 를 구현
public class SungJukSort implements SungJuk {
	
	//execute 메소드 구현(정렬 기능 수행)
	@Override
	public void execute(ArrayList<SungJukDTO>list) {
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) { 
			System.out.println();
			System.out.println("********************");
			System.out.println(" 1. 총점으로 내림차순");
			System.out.println(" 2. 이름으로 오름차순");
			System.out.println(" 3. 이전 메뉴");
			System.out.println("********************");
			System.out.print("번호 입력 : ");
			num = scan.nextInt();
			
			if(num == 3) break; //3번 이전메뉴로 돌아감
			if(num == 1) {
				//총점으로 내림차순 정렬
				Collections.sort(list);
				
			}else if(num == 2) {
				//이름으로 오름차순 정렬
				Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
	                   @Override
	                   public int compare(SungJukDTO s1, SungJukDTO s2) {
	                       return s1.getName().compareTo(s2.getName());

					}
				};
				Collections.sort(list, com);
			}
			
			System.out.println();
			System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
			for(SungJukDTO sungJukDTO : list) {
				System.out.println(sungJukDTO);
			}//for
			
			
		}//while
				
	}
}

	


