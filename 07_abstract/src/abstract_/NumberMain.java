package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); - error 추상클래스라 직접적으로 생성이 안된다.
		
		NumberFormat nf = new DecimalFormat();//Sub class 이용하여 생성을 했다.
		//DecimalFormat df = new DecimalFormat();
		
		//3자리마다 쉼표를 찍고 소수이하 3째자리까지 제공
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		//유효숫자가 아닌 것은 표현하지 않는다
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		//0을 강제로 표시
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//기본이 3자리마다 쉼표를 찍고 소수이하 3째자리까지 제공 => 소수이하 둘째자리로 변경
		//NumberFormat nf4 = NumberFormat.getInstance();//메소드 이용하여 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); //메소드 이용하여 생성,
		
		nf4.setMaximumFractionDigits(2); //소수이하 둘째자리
		nf4.setMinimumFractionDigits(2); //0을 강제표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		//NumberFormat nf5 = NumberFormat.getInstance(Locale.US);
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //달러표시
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		
	}

}
