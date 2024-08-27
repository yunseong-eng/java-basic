package while_;

public class DoWhile {

	public static void main(String[] args) {
		char ch = 'A';
		 int count = 0;
		 do {
			 System.out.print(ch++ + "  ");
			 count++; //1 2 3 4 ~~~ 6 7 8 9 10 ~~~
			 
			 if(count%7 == 0) System.out.println();
			 
		 }while(ch<='Z');
	   


	}

}


/*
[문제] A ~ Z 출력하되 1줄에 7개씩 출력하시오

A B C D E F G H


I J K L M N O P


Q R S T U V W X


Y Z
*/
