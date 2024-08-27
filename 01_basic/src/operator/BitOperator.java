package operator;

public class BitOperator {

	public static void main(String[] args) {
        int a = +16; // 16이라해도됨
		
		System.out.println("+16 = " + a);
		System.out.println("+16 = " + Integer.toBinaryString(a));
		System.out.println();
		
		System.out.println("~16 = " + ~a); //1의 보수
		System.out.println("~16 = " + Integer.toBinaryString(~a));
		System.out.println();
		
		System.out.println("-16 = " + (~a+1)); //2의 보수
		System.out.println("-16 = " + Integer.toBinaryString(~a+1));
		System.out.println();


	}

}
