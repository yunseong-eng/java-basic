package thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ATM implements Runnable { //Runnable 인터페이스 구현
	private long depositeMoney=100000; //잔액 100000 설정
	private long balance; //찾고자 하는 금액을 저장하는 변수
	
	@Override
	public synchronized void run() { //synchronized 락이 걸려서 엄마부터 돈을 찾고 나가야 아들이 들어옴
		System.out.println("안녕하세요 " + Thread.currentThread().getName() + " 고객님");
		
		//입력을 받기위한 BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.print("찾고자 하는 금액 입력 : ");
			balance = Long.parseLong(br.readLine()); //입력한 금액을 읽어 long타입으로 변환하고 balance변수에 저장
			
		} catch (IOException e) { //입력중 오류 발생시 이 블록 실행
			e.printStackTrace(); //오류 메세지 출력
		} 
		
		withDraw(); //잔액계산
		
	}
	
	public void withDraw() { //잔액계산 메소드 생성
		if(depositeMoney >= balance) {
			if(depositeMoney%10000 == 0) {
				depositeMoney -= balance;
				System.out.println("잔액은 " + depositeMoney + "원 입니다.");
			}else {
				System.out.println("만원 단위로 입력하세요.");
		}	
		}else {
		    System.out.println("잔액이 부족합니다.");
		}
		
	}
}
//------------------------
public class ATMMain {

	public static void main(String[] args) {
		ATM atm = new ATM(); //스레드를 하나 만들어놓고 
		
		//스레드 생성
		Thread mom = new Thread(atm, "엄마"); //setName으로 줘도되는데 이렇게 이름수정가능
		Thread son = new Thread(atm, "아들");
		
		mom.start(); //스레드 시작 -> 스레드 실행(run())
		son.start();

	}

}
