package multiArray;

public class MultiArray05 {

	public static void main(String[] args) {
		//다차원 배열의 가변길이 ex)cgv 자릿수가 줄마다 다르다
		int[][] ar = new int[3][];//행은 고정
		ar[0] = new int[2];
		ar[1] = new int[3];
		ar[2] = new int[4];
				
		ar[0][0] = 10;
		ar[0][1] = 20;
				
		ar[1][0] = 30;
		ar[1][1] = 40;
		ar[1][2] = 50;
				
		ar[2][0] = 60;
		ar[2][1] = 70;
		ar[2][2] = 80;
		ar[2][3] = 90;
				
		for(int i=0; i<ar.length; i++) {//행
			for(int j=0; j<ar[i].length; j++) {//열
				System.out.println("ar[" + i + "][" + j + "] = " + ar[i][j]);
			}
			System.out.println();
		}


	}

}
