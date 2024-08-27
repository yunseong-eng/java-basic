package homework;

//회원의 이름,나이,전화번호,주소 를 저장하는 데이터 전송객체
public class MemberDTO {
	private String name;
	private int age;
	private String phone;
	private String address;
	
	public MemberDTO() {} //기본생성자
	
	//매개변수가 있는 생성자
	public MemberDTO(String name, int age, String phone, String address) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}

