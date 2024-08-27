package class__;

//import static java.lang.Math.random; //밑에쓰기 귀찮아서 미리써주는것(비추천이긴함 헷갈려서)
//import static java.lang.Math.pow;
import static java.lang.Math.*; //*를 와일드카드(ALL)을 의미 ((비추천))
import static java.lang.System.out;
import static java.util.Arrays.sort;

import java.util.Arrays;

public class ImportStatic {

	public static void main(String[] args) {
		out.println("난수 = " + random()); //Math.random() 호출
		out.println("2의 5승 = " + pow(2, 5));//Math.pow(2, 5) 호출
		
		//정수 배열 정렬
		int[] ar = {25, 78, 32, 40, 55};
        sort(ar); //Arrays.sort(ar) 호출
		for(int data : ar) 
			out.print(data + "  "); //for문의 반복문이 한문장이면 { } 를 안써도됨
		
		out.println();
		
		//문자열은 문자들의 집합체 -> 한글자씩 ASCII코드 비교하여 작은것부터 입력된다.
		String[] ar2 = {"apple", "strawberry", "Applemango", "pineapple", "tomato"}; 
		sort(ar2);
		for(String data : ar2) 
			out.print(data + "  ");
		
	}

}











