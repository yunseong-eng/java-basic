package for_;

import java.io.IOException;

public class For02 {

	public static void main(String[] args) throws IOException {
		System.out.print("원하는 답을 입력 : ");
		int dan = System.in.read() -48; //'0';도같은수 //1개의 문자로 받음
		
		for (int i=1; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
}

/*
원하는 답을 입력 : 2 <- System.in.read()  dan//변수명    
    
2 * 1 =2
2 * 2 =4
2 * 3 =6
2 * 4 =8
2 * 5 =10
2 * 6 =12
2 * 7 =14
2 * 8 =16
2 * 9 =18

*/
