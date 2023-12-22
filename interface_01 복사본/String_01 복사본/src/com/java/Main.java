package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					//framework 활용
				//str 0 는 String 이라는 class에서 기능을 부여받음
		//모든것은 0부터 시작
		//화면에 뜨는 모든 것은 문자 ( 숫자도 포함)
				String str0="가나다라마바";  	//String <-객체형 변수 ( 원래 있던 것 이 아닌 편하게 사용하기 위해 만든것).
				String str1 = new String ("abcdefg");     //위와 같은 소리
				String str11 = new String ("ABCDEFG");
				String str2 = new String ("hjklmn");
				String str3 = new String ("  abc    ");
				 Scanner scanner = new Scanner(System.in);                        //객체형 변수는 앞에가 대문자    ( 대문자로 시작하면 앞에 new를  붙인다)
				 
			
					
					
				 System.out.println(str1);
				 System.out.println(str1.concat(str2));				//str.해서 나오는걸 사용하면API를 사용했다 하는것이고 그concat(str2)를 메소드 라고 부른다
				 System.out.println(str1.substring(3)); 			//sub == 부분 집합.    알아서 그 부분만 가져온다
				 System.out.println(str1.substring(3,5));            //3 <= str1 < 5  
					
				 
				//라마만 출력하기
				 
				 System.out.println(str0.substring(3,5));						
				 System.out.println(str1.length());                   		//ex id를 8자리 입력해 주세요.    줄	을 확인하여 다시입력하라는 메시지 .
			     System.out.println(str1.toUpperCase()); 						//대,소문자 변경
				 System.out.println(str2.toLowerCase());
				 
				 System.out.println(str1.charAt(3));
				 System.out.println(str1.indexOf('d'));	 					//d라는 애가 index몇 번지에 있나
				 
				 System.out.println(str1.equals(str2));     					//true of false 값으로 나옴
				
			//str1과 str11을  equals 로 비교해서 true 값이 나오게 하기	
				 
				 System.out.println( str1.equals(str11.toLowerCase()));
				
				System.out.println(str3.trim()); 									//값에 스페이스바를 없에줌
				 System.out.println(str1.replaceAll("abc", "z"));  				  //replace 는 문자를 바꾼다    replaceAll 은 문자열을 바꾼다
				 System.out.println(str1.replace('a', 'z'));
				 
				 
				 
				 
	}		

}
