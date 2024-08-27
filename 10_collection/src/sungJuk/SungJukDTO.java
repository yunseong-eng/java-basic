package sungJuk;
//학생 성적정보를 담는 클래스로 Comparable interface를 구현하여 총점 기준으로 비교 가능하게함
public class SungJukDTO implements Comparable<SungJukDTO> {
    private int no;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;
    
    public SungJukDTO() {}//기본생성자
    
    //매개변수가 있는 생성자
    public SungJukDTO(int no, String name, int kor, int eng, int math) {
    	this.no = no;
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.math = math;
    }
    //총점, 평균 계산 메소드
    public void calc() {
    	tot = kor + eng + math;
    	avg = tot/3.0;
    }

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public double getAvg() {
		return avg;
	}
	//객체 정보를 문자열로 반환하는 메소드
	@Override
	public String toString() {
		return no + "\t"
		+ name + "\t"
		+ kor + "\t"
		+ eng + "t"
		+ math + "\t"
		+ tot + "\t"
		+ String.format("%.2f", avg);
	}
	 //비교 메소드(총점으로 내림차순 정렬)
		@Override
		public int compareTo(SungJukDTO sungJukDTO) {
			//총점으로 내림차순
			if(this.tot > sungJukDTO.tot)return -1;
			else if(this.tot < sungJukDTO.tot)return 1;
			else return 0;
		}
	 
}
		
		
		
		
		
		



