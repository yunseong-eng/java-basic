package member.service;

import java.util.Scanner;

import member.dao.MemberDAO;

public class DeleteService implements Member {

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
				
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		//DB - 싱글톤
		MemberDAO memberDAO = MemberDAO.getInstance();
		boolean exist = memberDAO.isExistPwd(id, pwd);
		
		if(!exist) {
			System.out.println("비밀번호가 맞지 않습니다.");
			return;
		}
		
		int su = memberDAO.delete(id);
		
		System.out.println(su + "개의 행이 삭제되었습니다.");

	}

}






