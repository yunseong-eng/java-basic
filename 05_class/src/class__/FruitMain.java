package class__;

public class FruitMain {

	public static void main(String[] args) {
		Fruit[] ar = { new Fruit("사과", 100, 80, 75),
				       new Fruit("포도", 30, 25, 10),
		               new Fruit("딸기", 25, 30, 90)};
		
		System.out.println("---------------------------------------");	
		System.out.println("PUM     JAN    FEB     MAR     TOT");
		System.out.println("---------------------------------------");
		for(int i=0; i<ar.length; i++) {
			ar[i].calcTot();
			ar[i].display();
		}//for i 
        System.out.println("---------------------------------------");
        Fruit.output();


	}

}

/*
과일 판매량 구하기
월별 매출합계도 구하시오

[클래스]
Fruit
[필드]
pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar - 월 합계
[메소드]
생성자(품명, 1월, 2월, 3월)
calcTot()
display()
public static void output()

[클래스]
FruitMain

[실행결과]
---------------------------------------
PUM    JAN   FEB   MAR    TOT
---------------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------------
        155   xxx   xxx            output()로 처리
*/
