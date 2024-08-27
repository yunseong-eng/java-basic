package class_;

public class PersonMain {

	public static void main(String[] args) {
		Person aa; //객체
		aa = new Person(); //생성
		//aa = new Test(); - aa = new Person(); //생성error
		
		System.out.println("객체 aa = " + aa);
		aa.setName("홍길동"); //메소드 호출
		aa.setAge(25);
		System.out.println("이름 = " + aa.getName() + "  나이 = " + aa.getAge());
		System.out.println();
		
		Person bb = new Person();
		System.out.println("객체 bb = " + bb);
		bb.setName("코난");
		bb.setAge(13);
		System.out.println("이름 = " + bb.getName() + "  나이 = " + bb.getAge());
		System.out.println();
		
		Person cc = new Person();
		System.out.println("객체 cc = " + cc);
		cc.setData("또치", 50);
		System.out.println("이름 = " + cc.getName() + "  나이 = " + cc.getAge());
		System.out.println();
		
		Person dd = new Person();
		System.out.println("객체 dd = " + dd);
		dd.setData();
		System.out.println("이름 = " + dd.getName() + "  나이 = " + dd.getAge());
		System.out.println();
		

	}

}
