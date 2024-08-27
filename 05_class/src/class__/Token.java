package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		System.out.println("토큰 갯수 = " + st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("-----------------------------");
		
		String[] ar = str.split(","); //비어있는 값을 배열로 가져온다
		
		for(String data : ar) {
			System.out.println(data);
		}
	}

}
