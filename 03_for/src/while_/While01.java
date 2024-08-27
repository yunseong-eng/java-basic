package while_;

public class While01 {

	public static void main(String[] args) {
        int a=0;
		
		//1 2 3 4 5 6 7 8 9 10
		while(a<10) {
			a++;//1 2 ~~~~ 9 10 
			System.out.print(a + "  ");
		}//while
		System.out.println();
		
		//1 2 3 4 5 6 7 8 9 10
		int b=1;
		while(true) { //무한루프 = for(;;)
			System.out.print(b + "  ");
			b++;
			
			if(b>10) break;//갖고있는 값이 10이 돼버리면 나가라
		}//true


	}

}
