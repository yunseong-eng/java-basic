package class_;

public class ComputeDTO {
	private int x, y, sum, sub, mul;
	private double div;
	
	public void setX(int x) {
		System.out.println("this = " + this);
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x; //this 생략가능
	}
	public int getY() {
		return this.y; //this 생략가능
	}
	public int getSum(){
		return sum;
	}
	public int getSub(){
		return sub;
	}
	public int getMul(){
		return mul;
	}
	public double getDiv(){
		return div;
	}
	
	public void calc() {
		this.sum = this.x + this.y;
		this.sub = this.x - this.y;
		this.mul = this.x * this.y;
		this.div = (double)this.x / this.y;
	}

	

}
