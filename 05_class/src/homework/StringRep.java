package homework;

import java.util.Scanner;

public class StringRep {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        //문자열 입력받기
		System.out.print("문자열 입력 : ");
		String inputStr = scan.next().toLowerCase();//입력받은 문자열을 소문자로
		
		//현재 문자열 입력받기
		System.out.print("현재 문자열 입력 : ");
		String targetStr = scan.next().toLowerCase();
		
		//바꿀 문자열 입력받기
		System.out.print("바꿀 문자열 입력 : ");
		String changeStr = scan.next(); //치환 할 문자열 입력받기
		
		//찾고자 하는 문자열이 입력받은 문자열보다 긴 경우
		if(inputStr.length()<targetStr.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
		}else {
			int index = 0;
			int count = 0;
			
			//문자열 치환 횟수 계산
			while((index = inputStr.indexOf(targetStr, index)) != -1) {
				
				index += targetStr.length(); //찾고자 하는 문자열의 길이만큼 인덱스 이동
				count++;//치환 횟수 증가
				
			}//while
			
			//결과 출력
			System.out.println(inputStr.replace(targetStr, changeStr));
			System.out.println(count + "개 치환");
		}
		
	}
			
}
/*
[문제] 
치환하는 프로그램을 작성하시오 - indexOf(?, ?)을 사용, 치환은 replace()사용
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오

예시 : [실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1개 치환

문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1개 치환

문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2개 치환

문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환

문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다 
*/