package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 입력한 숫자부터 4개를 증가하여 화면 가로롤 구구단을 표시하기   (FOR)문 한번만 사용.
		Scanner scanner = new Scanner(System.in);
		   int num1 =0;    //입력변수지정
	       int e = 1 ;     
		System.out.print("Input your number : ");                						//입력 받아오기
		     num1 = scanner.nextInt();
		     
		     for ( int i = num1 ; i <= num1+3 && e < 10 ;   ) {         //구구단 돌리기
		    	 System.out.print(i + "x" + e + "=" + (i*e) + "\t\t" );   //출력문
		    	 if ( i  == num1 +3   ) {                                   //구구단 루프 시키기
		    		e++;
		    		 i = num1;
		    		 
		    		 System.out.println();
		             
		    	 } else {   														
		    		 i++;
		    	 }
		    
		    	
		     }
		
		     
		     
		     
		     
		     
		     
	}

}
