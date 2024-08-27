package class_;

public class SungJukMain {

	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		aa.setData("홍길동", 90, 96, 100);
		aa.calc();
		System.out.println(aa.getName() + "\t"
				+ aa.getKor() + "\t"
				+ aa.getEng() + "\t"
				+ aa.getMath() + "\t"
				+ aa.getTot() + "\t"
				+ String.format("%.2f",aa.getAvg()) + "\t"
				+ aa.getGrade());

	}

}
