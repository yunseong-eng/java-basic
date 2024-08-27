package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    DecimalFormat df = new DecimalFormat();
	    
	    System.out.print("이름 입력 : ");
	    String name = scan.next();
	    System.out.print("직급 입력 : ");
	    String job = scan.next();
	    System.out.print("기본급 입력 : ");
	    int basic = scan.nextInt();
	    System.out.print("수당 입력 : ");
	    int extra = scan.nextInt();
	    
	    int tot = basic + extra; //합계
	    double rate = tot >= 5000000 ? 0.03 : tot >= 3000000 ? 0.02 : 0.01; //세율

	    int tax = (int)(tot * rate);
	    int salary = tot - tax;
	    
	    System.out.println("*** "+ name + " " + job + " 월급 ***");
	    System.out.println("기본급 : " + df.format(basic) + "원");
	    System.out.println("수당 : " + df.format(extra) + "원");
	    System.out.println("합계 : " + df.format(tot) + "원");
	    System.out.println("세금 : " + df.format(tax) + "원");
	    System.out.println("월급 : " + df.format(salary) + "원");


	}

}
