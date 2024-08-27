package class__;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private char[] ox = null;
	private int score = 0;
	private final String JUNG = "11111";
	
	//기본 생성자 - Scanner 활용
	public Exam() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		this.name = scan.next();
		System.out.print("답 입력 : ");
		this.dap = scan.next();
		
		ox = new char[5]; //5문제
	}
	public void compare() {
		//for(int i=0; i<dap.length(); i++) {
		  for(int i=0; i<ox.length; i++) {
			if(JUNG.charAt(i) == dap.charAt(i)) {
				ox[i] = 'O';
				score += 20;
			}else {
				ox[i] = 'X';
			}
		}//for
	}
	public String getName() { return name; }	
	public char[] getOx() { return ox; }
	public int getScore() { return score; }	
}
//1인분 클래스