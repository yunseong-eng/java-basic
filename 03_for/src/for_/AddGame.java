package for_;

import java.util.Scanner;

public class AddGame {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		
		int a, b; //난수
		int dab; //정답
		int count; //맞은 갯수
		String yn; //또 할래
		
		while(true) {
			count = 0; //점수 초기화
			for(int i=1; i<=5; i++) { //5문제
				a = (int)(Math.random()*90+10); //10 ~ 99
				b = (int)(Math.random()*90+10); //10 ~ 99
				
				for(int j=1; j<=2; j++) { //틀리면 1번 더 기회
					System.out.print("[" + i + "] " + a + " + " + b + " = ");
					dab = scan.nextInt();
					
					if(dab == a+b) {
						System.out.println("정답입니다.");
						count++;
						break; //for j를 벗어나라
					}else {
						if(j == 2) System.out.println("오답입니다. 정답은 " + (a+b)); //2번 다 틀렸을경우
						else System.out.println("오답입니다.");
					}
				}//for j
				
				System.out.println();
			}//for i
	        
			System.out.println();
			System.out.println("당신은 총 " + count + "문제를 맞추어서 점수 " + count*20 + "점 입니다.");
			
			System.out.println();
			do {
			    System.out.print("또 할래(Y/N) : ");
			    yn = scan.next();
			}while(!yn.equals("Y") && !yn.equals("y")  && !yn.equals("N") && !yn.equals("n"));//yn의 값이 y도 아니고 n도아니고
			 if(yn.equals("N") || yn.equals("n")) break; //while 벗어나라
			
			
		}//while
		System.out.println("프로그램을 종료합니다.");

		
	}

}


/*
[문제] 덧셈 계산 (for, while, 다중 for)
- 10 ~ 99 사이의 난수를 2개 발생하여 합을 구하는 프로그램
- 총 5문제를 제공한다.
- 1문제당 점수 20점씩 처리한다.
- 틀리면 1번 더 기회를 주고, 2번 다 틀리면 답을 알려준다.
- y 또는 n은 대소문자 상관없게 작성하시오
- y 또는 n말고 다른 알파벳을 적을시 계속 반복한다.

[실행결과 예시]
[1] 25 + 36 = 50
틀렸다
[1] 25 + 36 = 59
틀렸다 정답은 ()

[2] 10 + 25 = 35
딩동뎅

[5] 78 + 95 = 89
틀렸다
[5] 78 + 95 = 173
딩동뎅

당신은 총 x 문제를 맞추어서 점수 ()점 입니다.

[또 할래 예시]
또 할래(Y/N) : A
또 할래(Y/N) : w
또 할래(Y/N) : n



프로그램을 종료합니다.
*/
