package lambda;

@FunctionalInterface //람다
public interface Compute {
	public void calc(int x, int y);  //람다식으로 쓰려면 추상메소드는 하나만!

}
