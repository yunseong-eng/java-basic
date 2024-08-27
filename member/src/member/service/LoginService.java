package member.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

public class LoginService implements Member {

	@Override
	public void execute() {
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.println();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
			
		//DB
		MemberDAO memberDAO = MemberDAO.getInstance();
		String name = memberDAO.login(id,pwd);
		
		if(name == null)
			System.out.println("아이디 또는 비밀번호가 맞지 않습니다.");
		else
			System.out.println(name + "님 로그인");

        
//		아이디 입력 : hong
//	    비밀번호 입력 : 113
//	    
//	    아이디 또는 비밀번호가 맞지 않습니다.
//	    -----------------------------------
//	    
//	    아이디 입력 : hong
//	    비밀번호 입력 : 111
//	    
//	     홍길동님 로그인
		
	}

	
}
