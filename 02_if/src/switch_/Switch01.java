package switch_;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월 입력 : ");
		int month = scan.nextInt();
		int days = 0;
		
		if(month == 1) days = 31;
		else if(month == 2) days = 28;
		else if(month == 3) days = 31;
		else if(month == 4) days = 30;
		else if(month == 5) days = 31;
		else if(month == 6) days = 30;
		else if(month == 7) days = 31;
		else if(month == 8) days = 31;
		else if(month == 9) days = 30;
		else if(month == 10) days = 31;
		else if(month == 11) days = 30;
		else if(month == 12) days = 31;
		
			System.out.println(month + "월은" + days + "일 입니다.");
			
		switch(month) {
		case 1 :
		case 3 : 
		case 5 : 
		case 7 : 
		case 8 : 
		case 10 : 
		case 12 : days=31; break;
		case 2 : days=28; break;
		case 4 : 
		case 6 : 
		case 9 : 
		case 11 : days=30; break;
		}
		
		   System.out.println(month + "월은" + days + "일 입니다.");

	}

}
