package member.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Data
public class MemberDTO {
	private String name;
	private String id;
	private String pwd;
	private String phone;
	
	@Override
	public String toString() {
		return name + "\t"
			   + id + "\t"
			   + pwd + "\t"
			   + phone;
	}
}
