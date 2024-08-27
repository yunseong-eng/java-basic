package collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorMain {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); //0
		System.out.println("벡터 용량 = " + v.capacity()); //기본용량 10, 항목이 들어 갈 공간이 없으면 10개씩 자동으로 증가
		System.out.println();
		
		System.out.println("항목 추가");
		for(int i=1; i<=10; i++) {
			v.add(i + ""); //Vector 에 String 값을 줘서 ""을 붙임
			System.out.print( v.get(i-1) + "  "); //index는 0부터 시작
		}//for
		System.out.println();
		System.out.println("벡터 크기 = " + v.size()); //10
		System.out.println("벡터 용량 = " + v.capacity()); //기본용량 10, 항목이 들어 갈 공간이 없으면 10개씩 자동으로 증가
		System.out.println();
		
		System.out.println("항목 1개 추가");
		v.addElement(5 + ""); //중복 허용
		System.out.println("벡터 크기 = " + v.size()); //11
		System.out.println("벡터 용량 = " + v.capacity()); //20
		System.out.println();
		
		for(int i=0; i<v.size(); i++) {
			System.out.print(v.get(i)+ "  ");
		}
		System.out.println();
		
		System.out.println("항목 5를 삭제");
		//v.remove(5); //index 5번항목 6일 삭제
		v.remove(5+ ""); //중복된 5중에 앞에있는 5를 지운다.
		System.out.println(v);
		System.out.println();
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "  ");
		}
		System.out.println();
			
		}
	
	}


