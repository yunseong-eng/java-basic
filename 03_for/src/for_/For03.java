package for_;

public class For03 {

	public static void main(String[] args) {
		int sum=0;
		int mul=1; //곱하기는 초기값 1 0을곱하면 0이돼서
		
		System.out.println("\t합\t곱");
		for (int i=1; i<=10; i++) {
			sum = sum + i;
			mul = mul * i;
			System.out.println(i + "\t" + sum + "\t" + mul);
		}//for


	}

}


/*
       합        곱

1	   1	     1 
2	   3		 2	
3      6         6  
4                24
5
6
7
8
9
10     55       3628800     
*/
