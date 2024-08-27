package board.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
	private int number; //글번호
	private String id; //아이디
	private String name; //이름
	private String title; //제목
	private String sub; //내용
	private String date; //날짜
	
	@Override
	public String toString() {
		return "글번호 : " + number +
				"\t아이디 : " + id +
				"\t이름: " + name +
	            "\t제목: " + title +
	            "\t내용: " + sub +
	            "\t날짜: " + date;
	}
}
