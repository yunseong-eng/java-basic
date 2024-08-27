package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	private PreparedStatement pstmt; //가이드 
	
	public UpdateMain() {
		try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void getConnection() {
		try {
			con = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateArticle() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.next();
		
		this.getConnection(); //this 생략가능
		
		try {
			pstmt = con.prepareStatement("update dbtest set age=age+1 where name like ?");
			
			pstmt.setString(1, "%" + name + "%");
			
			int su = pstmt.executeUpdate();
			
			System.out.println(su + "개의 행이 수정되었습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
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
		new UpdateMain().updateArticle();
		
	}

}
