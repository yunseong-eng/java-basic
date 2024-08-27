package class_;

public class SalaryDTO {
	private String name;
	private String job;
	private int basic;
	private int extra;
	private int total;
	private double rate;
	private int tax;
	private int salary;
	
	public void setData(String n , String j, int b, int e) {
		name = n;
		job = j;
		basic = b;
		extra = e;
	}
	
	public void calc() {
		total = basic + extra;
		rate = total >= 5000000 ? 0.03 : total >= 3000000 ? 0.02 : 0.01;
		tax = (int)(total * rate);
		salary = total - tax;
	}
	
	public String getName() { return name; }
	public String getJob() { return job; }
	public int getBasic() { return basic; }
	public int getExtra() { return extra; }
	public int getTotal() { return total; }
	public double getRate() { return rate; }
	public int getTax() { return tax; }
	public int getSalary() { return salary; }	


	

}
