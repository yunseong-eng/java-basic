package exception;

public class MakeException extends Exception { //사용자가 만든 Exception 예외처리 클래스
	private String errorMsg;
	
	public MakeException() {} //sourse 컨트럭터 유징필드

	public MakeException(String errorMsg) {
		super();
		this.errorMsg = errorMsg;
	}
	
	@Override
		public String toString() {
			return errorMsg;
		}

}

//throws 와 try catch 는 알아야한다!!!