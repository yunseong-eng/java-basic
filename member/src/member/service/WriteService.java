package member.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import member.bean.MemberDTO;
import member.dao.MemberDAO;

public class WriteService implements Member {

    @Override
    public void execute() {
    	System.out.println();
        Scanner scan = new Scanner(System.in);
        
        //DB- 싱글톤
        MemberDAO memberDAO = MemberDAO.getInstance();
        
        System.out.print("이름 입력 : ");
        String name = scan.next();

        // 중복체크
        String id = null;
        while(true) {
        	System.out.println();
        	System.out.print("아이디 입력 : ");
        	id = scan.next();
        	
        	//DB
        	boolean exist = memberDAO.isExistId(id);
        	if(exist)
        		System.out.println("사용중인 아이디 입니다.");
        	else {
        		System.out.println("사용 가능한 아이디 입니다.");
        		break;
        	}
        }//while

        System.out.print("비밀번호 입력 : ");
        String pwd = scan.next();  // 필드명 일치

        System.out.print("핸드폰 입력 (010-1234-5678) : ");
        String phone = scan.next();

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setName(name);
        memberDTO.setId(id);
        memberDTO.setPwd(pwd);  // 필드명 일치
        memberDTO.setPhone(phone);

        //입력
        int su = memberDAO.write(memberDTO);
        
        System.out.println(su + "개의 행이 만들어졌습니다.");
    }
}