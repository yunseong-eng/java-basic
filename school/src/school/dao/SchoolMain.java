package school.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SchoolMain {
	private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";
    
    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;
    
    public SchoolMain() {
    	try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
    
    public void getConnection() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
            System.out.println("       관리");
            System.out.println("********************");
            System.out.println("   1. 입력");
            System.out.println("   2. 검색");
            System.out.println("   3. 삭제");
            System.out.println("   4. 종료");
            System.out.println("********************");
            System.out.print("  번호 선택 : ");
            num = scan.nextInt();
            
            if(num==4) break;
            if(num==1) insertArticle();
            else if(num==2) selectArticle();
            else if(num==3) deleteArticle();
		}//while
		
	}//menu()

	private void deleteArticle() {
		System.out.println();
		Scanner scan = new Scanner(System.in);
        
		System.out.print("삭제할 이름 입력 : ");
		String name = scan.next();
		
		//DB
		getConnection();
		
		String sql = "delete school where name = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,name);
			int su = pstmt.executeUpdate();

            System.out.println(su + "개의 행이 삭제되었습니다.");
            
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
            try {
                if(pstmt != null) pstmt.close();
                if(con != null)con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
		
	}//deleteArticle()

	private void selectArticle() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
	        System.out.println("    1. 이름 검색  ");
	        System.out.println("    2. 전체 검색  ");
	        System.out.println("    3. 이전메뉴 ");
	        System.out.println("********************");
	        System.out.print("  번호선택 : ");
	        num = scan.nextInt();
	        
	        if(num==3) break;
	        
	        System.out.println();
	        String name = null;
	        if(num==1) {
	        	System.out.print("검색할 이름 입력 : ");
		        name = scan.next();
	        }
	        
	        //DB
	        getConnection();
	        
	        String sql;
	        if(num==1)
	        	sql = "SELECT * FROM SCHOOL WHERE NAME LIKE ?";
	        else
	        	sql = "SELECT * FROM SCHOOL";
	        
	        try {
				pstmt = con.prepareStatement(sql);
				if(num==1) pstmt.setString(1, "%"+name+"%");
				rs = pstmt.executeQuery();
				
				while(rs.next()) {
					System.out.print("이름 = " + rs.getString("name") + "\t");
					
					if(rs.getInt("code") == 1)
						System.out.println("학변 = " + rs.getString("value"));
					else if(rs.getInt("code") == 2)
						System.out.println("과목 = " + rs.getString("value"));
					else if(rs.getInt("code") == 3)
						System.out.println("부서 = " + rs.getString("value")); 
				}//while
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
	            try {
	            	if(rs != null) rs.close();
	                if(pstmt != null) pstmt.close();
	                if(con != null)con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        	
		}//while
		
	}//selectArticle()

	private void insertArticle() {
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("********************");
	        System.out.println("    1. 학생  ");
	        System.out.println("    2. 교수  ");
	        System.out.println("    3. 관리자  ");
	        System.out.println("    4. 이전메뉴 ");
	        System.out.println("********************");
	        System.out.print("  번호선택 : ");
	        num = scan.nextInt();
	        
	        if(num==4) break;
	        
	        System.out.println();
	        String name = null;
	        String value = "";
	        System.out.print("이름 입력 : ");
	        name = scan.next();
	        
	        if(num==1) {
	        	System.out.print("학번 입력 : ");
	            value = scan.next();
	            
	        }else if(num==2) {
	        	System.out.print("과목 입력 : ");
	        	value = scan.next();
	        	
	        }else if(num==3) {
	        	System.out.print("부서 입력 : ");
	            value = scan.next();
	            
	        }
	        
	        //DB
	        getConnection();
	        
	        String sql = "insert into school values(?,?,?)";
	        try {
				pstmt = con.prepareStatement(sql);
				
				pstmt.setString(1, name);
	            pstmt.setString(2, value);
	            pstmt.setInt(3, num);
	            
	            int su = pstmt.executeUpdate();
	            
	            System.out.println(su + "개의 행이 삽입되었습니다.");
	            
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
	            try {
	                if(pstmt != null) pstmt.close();
	                if(con != null)con.close();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	        }
	        
		}//while
		
	}//insertArticle()
	
	public static void main(String[] args) {
		SchoolMain schoolMain = new SchoolMain();
		schoolMain.menu();
		System.out.println("프로그램을 종료합니다");
	}

}


/*

[문제]
Java Project  : school
Package : school.dao
Class    : SchoolMain.java

# 테이블 작성
create table school (
name  varchar2(15)  not  null, -- 이름
value   varchar2(15), -- 학번 or 과목 or 부서
code   number   -- 1이면 학생, 2이면 교수, 3이면 관리자
);

menu()
****************
   관리
****************
  1. 입력
  2. 검색
  3. 삭제
  4. 종료
****************
  번호선택 : 4
프로그램 종료합니다

1번인 입력인 경우 - insertArticle()
****************
   1. 학생
   2. 교수
   3. 관리자
   4. 이전메뉴
****************
   번호선택 : 

1-1번 학생인 경우
이름 입력 : 
학번 입력 : 

1-2번 교수인 경우
이름 입력 : 
과목 입력 : 

1-3번 관리자인 경우
이름 입력 : 
부서 입력 : 

1 행이 삽입되었습니다.


2번 검색인 경우 - selectArticle()
****************
   1. 이름 검색 (1개 글자가 포함된 이름은 모두 검색)
   2. 전체 검색
   3. 이전메뉴
****************
   번호선택 : 1

2-1번 이름 검색인 경우
검색할 이름 입력 : 이
이름 = 이교수	과목= 자바
이름 = 이관리	부서= 기획
이름 = 이학생	학번= 2002

2-2번 전체 검색인 경우
이름 = 이교수	과목 = 자바
이름 = 코난	학번 = 2022
이름 = 홍길동	학번 = 2000
이름 = 이관리	부서 = 기획
이름 = 김교수	과목 = C
이름 = 이학생	학번 = 2002


3번 삭제인 경우 - deleteArticle()
삭제를 원하는 이름 입력 : (정확하게 3개의 글자가 모두 입력된 상태)
x개 행이 삭제되었습니다.

 */
