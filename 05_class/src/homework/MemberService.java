package homework;

import java.util.Scanner;
//회원관리 서비스
public class MemberService {
	//최대 5명 회원 정보를 저장할 배열선언
	private MemberDTO[] ar = new MemberDTO[5]; 
	private Scanner scan = new Scanner(System.in);
	//기본 생성자
	public MemberService() {
		System.out.println("MemberService 기본 생성자");
	}
	//메뉴를 출력하고 사용자의 선택을 처리하는 메소드
	public void menu() {
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("******************");
			System.out.println("   1. 가입");
			System.out.println("   2. 출력");
			System.out.println("   3. 수정");
			System.out.println("   4. 탈퇴");
			System.out.println("   5. 끝내기");
			System.out.println("******************");
			System.out.print("   번호 : ");
			num = scan.nextInt();
			
			if(num == 5) break;
			if(num == 1) this.insert(); //가입 메소드 호출
			else if(num == 2) list(); //출력 메소드 호출
			else if(num == 3) update(); //수정 메소드 호출
			else if(num == 4) delete();// 탈퇴 메소드 호출
		}//while
		
	}//menu()
	
	//회원가입 메소드
	public void insert() {
		System.out.println();
		
		//배열에서 빈 자리를 찾기위한 변수 선언
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] == null) break; 
		}//for
		
		//배열이 가득 찬 경우 메소드를 종료
		if(i == ar.length) {
			System.out.println(ar.length + "명의 정원이 꽉 찼습니다.");
			return; 
		}
		
		//새로운 MemberDTO 객체를 배열의 빈 자리에 저장
		ar[i] = new MemberDTO(); 
		System.out.print("이름 입력 : ");
		ar[i].setName(scan.next());
		System.out.print("나이 입력 : ");
		ar[i].setAge(scan.nextInt());
		System.out.print("핸드폰 입력 : "); 
		ar[i].setPhone(scan.next());
		System.out.print("주소 입력 : "); 
		ar[i].setAddress(scan.next());
		
		System.out.println("회원 가입이 되었습니다.");
		
	}//insert()
	
	//회원 정보 출력 메소드
	public void list() {
		System.out.println();
		
		//배열을 순회하며 각 회원정보를 출력
		for(MemberDTO dto : ar) {
			if(dto != null)
				System.out.println(dto.getName() + "\t"
								 + dto.getAge() + "\t"
								 + dto.getPhone() + "\t"
								 + dto.getAddress());
		}
		
	}//list()
	
	//회원정보 수정 메소드
	public void update() {
		System.out.println();
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					System.out.println(ar[i].getName() + "\t"
							 + ar[i].getAge() + "\t"
							 + ar[i].getPhone() + "\t"
							 + ar[i].getAddress());
					
					System.out.println();
					System.out.print("수정 할 이름 입력 : ");
					ar[i].setName(scan.next());
					System.out.print("수정 할 나이 입력 : ");
					ar[i].setAge(scan.nextInt());
					System.out.print("수정 할 핸드폰 입력 : ");
					ar[i].setPhone(scan.next());
					System.out.print("수정 할 주소 입력 : ");
					ar[i].setAddress(scan.next());
					
					System.out.println("\n 회원의 정보를 수정하였습니다.");
					
					break;
				}
			}
		}//for i
		
		if(i == ar.length)
			System.out.println("찾는 회원이 없습니다");
		
	}//update()
	
	//회원탈퇴 메소드
	public void delete() {
		System.out.println();
		System.out.print("핸드폰 번호 입력 : ");
		String phone = scan.next();
		
		int i;
		for(i=0; i<ar.length; i++) {
			if(ar[i] != null) {
				if(ar[i].getPhone().equals(phone)) {
					//해당 회원정보를 배열에서 삭제(null로 설정)
					ar[i] = null;
					System.out.println("회원의 정보를 삭제하였습니다.");
					break;
				}
			}
		}//for i
		
		if(i == ar.length)
			System.out.println("찾는 회원이 없습니다");
		
	}//delete()

}



