package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2 {
	private int x, y;
	
	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //데이터가 흘러갈 길을 만든것
	
		System.out.print("x값 입력 : ");
		x = Integer.parseInt(br.readLine());
		
		System.out.print("y값 입력 : ");
		y = Integer.parseInt(br.readLine());
		
	}
	
	 public void output() {
		 int mul = 1;
		 if(y>=0) {
			 for(int i=1; i<=y; i++) {
				 mul *=x;
			 }//for
			 
			 System.out.println("-----------------------------------------------");
			 System.out.println(x + "의 " + y + "승은 " + mul);
			 
		 }else {
			 //System.out.println("y는 0보다 크거나 같아야 한다");
			 
			 try {
				// throw new Exception("y는 0보다 크거나 같아야 한다");  //강제로 Exception 발생  , throw는 바이러스 throws는 백신
				 throw new MakeException("y는 0보다 크거나 같아야 한다"); //좀 더 깔끔하게나옴
				 
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
	     }
	 } 
	 
	 public static void main(String[] args) throws IOException {
		 ExceptionMain2 em = new ExceptionMain2(); 
		 em.input(); //호출
		 em.output();

	}

}

/*
x값 입력 : 2
y값 입력 : 5                       input()
-----------------------------------------------
2의 5승은 xx                       output()
*/