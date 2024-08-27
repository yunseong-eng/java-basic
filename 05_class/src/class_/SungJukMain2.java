package class_;

public class SungJukMain2 {

	public static void main(String[] args) {
		SungJuk aa = new SungJuk();
		aa.setData("홍길동", 90, 95, 100);
		aa.calc();
		System.out.println(aa.getName() + "\t"
				+ aa.getKor() + "\t"
				+ aa.getEng() + "\t"
				+ aa.getMath() + "\t"
				+ aa.getTot() + "\t"
				+ String.format("%.2f",aa.getAvg()) + "\t"
				+ aa.getGrade());
		
		SungJuk bb = new SungJuk();
		bb.setData("프로도", 100, 89, 76);
		bb.calc();
		System.out.println(bb.getName() + "\t"
				+ bb.getKor() + "\t"
				+ bb.getEng() + "\t"
				+ bb.getMath() + "\t"
				+ bb.getTot() + "\t"
				+ String.format("%.2f",bb.getAvg()) + "\t"
				+ bb.getGrade());
		
		SungJuk cc = new SungJuk();
		cc.setData("라이언", 75, 80, 48);
		cc.calc();
		System.out.println(cc.getName() + "\t"
				+ cc.getKor() + "\t"
				+ cc.getEng() + "\t"
				+ cc.getMath() + "\t"
				+ cc.getTot() + "\t"
				+ String.format("%.2f",cc.getAvg()) + "\t"
				+ cc.getGrade());


	}

}
