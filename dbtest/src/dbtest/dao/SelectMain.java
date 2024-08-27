package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";
	
	private Connection con;
	private PreparedStatement pstmt; //가이드 
	private ResultSet rs; //select는 인터페이스 ResultSet에 담아서 가져온다.
	
	public SelectMain() {
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
	
	public void selectArticle() {
		getConnection();
		
		String sql = "select * from dbtest"; //쓰기 편하게 빼놓은것
		try {
			pstmt = con.prepareStatement(sql); //생성
			rs = pstmt.executeQuery();//실행
			
			while(rs.next()) {
				System.out.println(rs.getString("name") + "\t"
						            + rs.getInt("age") + "\t"
						            + rs.getDouble("height") + "\t"
						            + rs.getString("logtime") + "\t");
			}//while
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//거꾸로 close 해야됨
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new SelectMain().selectArticle();
		
	}

}
