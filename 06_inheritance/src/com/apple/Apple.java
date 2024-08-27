package com.apple;

import com.zoo.Zoo;

public class Apple {

	public static void main(String[] args) {
		System.out.println("빨강 사과");
		
		//Zoo클래스의 tiger() 호출
		Zoo zoo = new Zoo(); //생성자 
		zoo.tiger();
		//zoo.giraffe(); //protected라 접근불가(protected는 자식클래스는 가능)
		//zoo.elephant();
		//zoo.lion();
		
	}

}
