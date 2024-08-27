package member.main;

import java.util.Scanner;

import member.service.DeleteService;
import member.service.LoginService;
import member.service.Member;
import member.service.UpdateService;
import member.service.WriteService;

public class IndexMain {

    public void menu() {
        Scanner scan = new Scanner(System.in);
        Member member = null;
        int num;

        while (true) {
            System.out.println();
            System.out.println("******************");
            System.out.println("  1. 회원가입");
            System.out.println("  2. 로그인");
            System.out.println("  3. 회원정보수정");
            System.out.println("  4. 회원탈퇴");
            System.out.println("  5. 끝");
            System.out.println("******************");
            System.out.print("  번호 : ");
            num = scan.nextInt();

            if (num == 5) break;
            if (num == 1) member = new WriteService();
            else if (num == 2) member = new LoginService();
            else if(num == 3) member = new UpdateService();
            else if(num == 4) member = new DeleteService();

            member.execute(); //호출 -> write쪽으로 넘어감
        }//while

    }//menu()

    public static void main(String[] args) {
        IndexMain indexMain = new IndexMain();
        indexMain.menu();
        System.out.println("프로그램을 종료합니다.");
    }
}
/*
Java Project : member

Package        : member.main
Class            : IndexMain.java - main()

Package        : member.service
Interface        : Member.java
                        public void execute();
Class            : WriteService.java
                       LoginService.java

Package        : member.bean
Class            :  MemberDTO.java

Package        : member.dao
Class            :  MemberDAO.java   (Data  Access  Object)

Folder : lib
File : ojdbc11.jar
       lombok.jar
          
Folder : sql
File   : member.sql                      
                      
데이터 : 이름(name), 아이디(id), 비밀번호(pwd), 핸드폰(phone)

테이블 : member
컬럼  : 이름, 15자리
컬럼  : 아이디, 30자리
컬럼  : 비밀번호, 50자리
컬럼  : 핸드폰, 20자리                     
*/

