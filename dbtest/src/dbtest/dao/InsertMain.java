package dbtest.dao; //자바 파일에서 DB로 접근

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
    
	private Connection con;	
    private PreparedStatement pstmt; //가이드 
	
	public InsertMain() { 
		try {
			Class.forName(driver); //생성자에서 드라이버 로딩
			System.out.println("driver loading");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public void getConnection() {
		//jdbc:oracle:thin:@localhost:1521:xe 외우기
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("connection");
		
	}
	public void insertArticle() {
		//데이터
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("나이 입력 : ");
		int age = scan.nextInt();
		System.out.print("키 입력 : ");
		double height = scan.nextDouble();
		
		//SQL
		this.getConnection(); //호출
		
		try {
			pstmt = con.prepareStatement("insert into dbtest values(?,?,?,sysdate)"); //생성
			
			//?의 데이터를 매핑(연결)
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);
			
			int su = pstmt.executeUpdate(); //실행 - 개수를 리턴(몇개를 만들었습니다.)
			
			System.out.println(su + "개의 행이 삽입되었습니다.");
			
					
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//거꾸로 close 해야됨
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new InsertMain().insertArticle();//기본생성자

	}

}


/*
오라클 드라이버 파일로 
oracle.jdbc.driver.OracleDriver.class 가 필요

이 파일이 클래스인지 인터페이스인지 모르겠다.
어쨋든 자바에서 쓰이는 애이니깐 
Class 타입으로 밀어붙인다.
Class가 class가 아니다. (class Class) 
*/








