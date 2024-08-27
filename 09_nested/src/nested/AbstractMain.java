package nested;

public class AbstractMain {

	public static void main(String[] args) {
		//AbstractTest at = new AbstractTest(); - error 추상이라
		
		AbstractTest at = new AbstractTest() { //익명 Inner class
			@Override
			public void setName(String name) {} //메소드의 구현부 {}를 처리하는건 class뿐이다. 
		};
		
		InterA in = new InterA() { 
			@Override
			public void aa() {}
			@Override
			public void bb() {}
		};		
		
		AbstractExam ae = new AbstractExam() {
			//개발자가 원하는 메소드만 Override
		};

	}

}
/*
  익명 inner class 
   new 클래스() {
   메소드(){
    }
  }
*/
  