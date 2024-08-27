package class_;

public class SungJukMain3 {

	public static void main(String[] args) {
		SungJuk[] ar = new SungJuk[3];
		ar[0] = new SungJuk();
		ar[1] = new SungJuk();
		ar[2] = new SungJuk();
		
		ar[0].setData("프로도", 100, 89, 76);
		ar[1].setData("라이언", 75, 80, 48);
		ar[2].setData("무지", 85, 75, 80);
		
		for(int i = 0; i < ar.length; i++) {
			ar[i].calc();
			System.out.println(ar[i].getName() + "\t"
					+ ar[i].getKor() + "\t"
					+ ar[i].getEng() + "\t"
					+ ar[i].getMath() + "\t"
					+ ar[i].getTot() + "\t"
					+ String.format("%.2f", ar[i].getAvg()) + "\t"
					+ ar[i].getGrade());
					
		}//for

	}

}
