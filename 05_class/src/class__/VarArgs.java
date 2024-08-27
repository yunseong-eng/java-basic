package class__;

public class VarArgs {
	/*
	public int sum(int a, int b) {
		return a+b;
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public int sum(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	*/
	
	// 인수의 갯수를 자유롭게 - 내부적으로 배열로 인식한다
	public int sum(int... ar) {
		int hap = 0;
		for(int i=0; i<ar.length; i++) {
			hap += ar[i];
		}//for
		
		return hap;
		
	}
	/*public VarArgs() {}*/ //하나도 없어서 생성자 호출 기본생성.
	
	public static void main(String[] args) {
		VarArgs va = new VarArgs();
		
		System.out.println("합 = " + va.sum(10, 20));
		System.out.println("합 = " + va.sum(10, 20, 30));
		System.out.println("합 = " + va.sum(10, 20, 30, 40));

	}

}
