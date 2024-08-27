package for_;

public class For01 {

	public static void main(String[] args) {
        int i; //지역변수 (local variable)
		
        //1 ~ 10 까지 출력하는 반복문
		for(i =1; i<=10; i++) {
			System.out.println("Hellow Kitty!!  " + i);
		}//for문
		System.out.println("탈출 i = " + i);
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		for(i =10; i>=1; i--) {
			System.out.print(i + "  ");
		}
		System.out.println();
		
		//A B C D E F G ~~~ X Y Z
		for(i ='A'; i<='Z'; i++) {
			System.out.print((char)i + "  ");
		}
		System.out.println();
			


	}

}
/*
local variable (지역변수)
- { 구역 } 안에 선언된 변수
- { 구역 } 을 벗어나면 소멸된다.
*/
