package thread;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock extends Frame implements Runnable {
	
    public Clock() {
    	setFont(new Font("Consolas", Font.BOLD, 30)); //글자변경 및 글자크기변경
    	
    	setForeground(new Color(255, 255, 0));  //노란색 글씨
    	setBackground(new Color(219, 209, 252)); //연보라색
    	
    	//setSize(300, 400);
    	setBounds(900, 200, 300, 400); //창 자리설정
    	setVisible(true);
    	
    	Thread t = new Thread(this); //스레드 생성
    	t.start(); //스레드 시작 -> 스레드 실행(운영체제가 run() 호출)
    	
    	//X눌러서 창 끄기
    	this.addWindowListener(new WindowAdapter() { // new WindowAdapter는 모든 추상메소드를 오버라이드해줌
    		@Override
    		public void windowClosing(WindowEvent e) {
    			System.exit(0);//강제종료
    		}
    	});
    
    }
    
	@Override
	public void run() {
		while(true) {
			repaint();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//while
		
	}
	
	//Call Back
	//Frame에 그려준다.
	@Override
	public void paint(Graphics g) { 
		SimpleDateFormat sdf = new SimpleDateFormat("HH : mm : ss");  //~~ : ~~ : ~~
		Date date = new Date();	//현재시간	
		g.drawString(sdf.format(date), 50, 100);
		System.out.println(sdf.format(date)); //콘솔창
	}

	public static void main(String[] args) {
		new Clock(); //Frame이 생성되고, paint() 호출
		
	}
}


//가볍게보기