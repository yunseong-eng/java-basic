package com.zoo.safari;

import com.zoo.Zoo;

public class Safari extends Zoo { //자식클래스 생성,패키지는 다름 

	public static void main(String[] args) {
		Zoo zoo = new Zoo(); //생성자 
		zoo.tiger();
		//zoo.giraffe(); //protected라 접근가능하지만 생성자가 부모로 잡혀있어서 error뜸
		//zoo.elephant();
		//zoo.lion();
		
		//자식클래스에 생성자 만들자
		Safari safari = new Safari();
		safari.tiger();
		safari.giraffe(); //자식 클래스에 만들어서 error안뜸
		//safari.elephant();
		//safari.lion();


	}

}
