package homework;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[6];
		
		System.out.println("현금 입력 : ");
		int money = scan.nextInt();
		
		for(int k=1; k<money/1000; k++) {
			//난수발생
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()* 45+1);
				
				//중복채크 (이중 for문)
				for(int j=0; j<i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					}
				}
			}//for i
			
			//오름차순
			Arrays.sort(lotto);
			
			//출력
			for(int data : lotto) {
			System.out.print(String.format("%5d", data));
		}
		System.out.println();
		
		if(k%5 == 0)System.out.println();
		}//for k
		

	}

}


/*
[문제] 로또 프로그램 - 자동 번호
1. 1 ~ 45까지의 정수형 값을 가진 6개인 배열이다.
2. 중복된 숫자를 가지면 안된다.
3. 오름차순으로 정렬
4. 1줄당 1000원 
5. 출력시 5자리로 맞춘다.
6. 5줄마다 줄바꿈을 한다.

[예시: 실행결과]
돈 입력 : 3200
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    
현금 입력 : 7000    
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37

    1   16   32   34   41   42
    5    6   18   30   33   44

*/
