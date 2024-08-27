package if_;

import java.io.IOException;

public class Input {

	public static void main(String[] args) throws IOException {
		System.out.println("문자 입력 :");
		int a = System.in.read(); //1개의 문자만 입력받아준다
		System.in.read(); //flush (버퍼를 지움)
		System.in.read(); //flush 효과
		
		System.out.println("문자 입력 :");
		int b = System.in.read();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);


	}

}
