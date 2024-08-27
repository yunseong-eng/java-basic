
package board.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import board.bean.BoardDTO;

public class BoardDAO {
    private String driver = "oracle.jdbc.driver.OracleDriver";
    private String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private String username = "c##java";
    private String password = "1234";

    private Connection con;
    private PreparedStatement pstmt;
    private ResultSet rs;

    // 싱글톤 패턴
    private static BoardDAO instance = new BoardDAO();

    private BoardDAO() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static BoardDAO getInstance() {
        return instance;
    }

    public void getConnection() {
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public int write(BoardDTO boardDTO) {
        int su = 0;
        
        getConnection();
        String sql = "insert into board_java values(?,?,?,?,?,?)"
        		     + "values (board_java_seq.nextval, ?,?,?,?,sysdate)";

        try {
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, boardDTO.getId());
            pstmt.setString(2, boardDTO.getName());
            pstmt.setString(3, boardDTO.getSub());
            pstmt.setString(4, boardDTO.getDate());

            su = pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
           try {
        	   if(pstmt != null) pstmt.close();
        	   if(con != null) con.close();
           } catch (SQLException e) {
				e.printStackTrace(); 
           }
        }

        return su;
    }

    // 모든 게시글 조회 (최신순)
    public List<BoardDTO> getAllBoards() {
        List<BoardDTO> boardList = new ArrayList<>();
        
        getConnection();
        
        String sql = "select * from board_java order by seq desc";

        try {
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

            while (rs.next()) {
                BoardDTO boardDTO = new BoardDTO();
                boardDTO.setNumber(rs.getInt("seq"));
                boardDTO.setId(rs.getString("id"));
                boardDTO.setName(rs.getString("name"));
                boardDTO.setSub(rs.getString("subject"));
                boardDTO.setDate(rs.getString("content"));
                boardDTO.setDate(sdf.format(rs.getDate("logtime")));

                boardList.add(boardDTO);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
        }

        return boardList;
    }

        public BoardDTO getBoard(int seq) {
        BoardDTO boardDTO = null;
        getConnection();
        String sql = "select * from board_java where seq =?";

        try {
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1, seq);
            
            rs = pstmt.executeQuery();

            if (rs.next()) {
                boardDTO = new BoardDTO();
                boardDTO.setNumber(rs.getInt("seq"));
                boardDTO.setId(rs.getString("id"));
                boardDTO.setName(rs.getString("name"));
                boardDTO.setSub(rs.getString("subject"));
                boardDTO.setDate(rs.getString("content"));
                boardDTO.setDate(rs.getString("logtime"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        	try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
        }

        return boardDTO;
    }

 }

