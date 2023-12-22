package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
				int sum =0;
			int startNum = 0;
			int endNum =0;
				Scanner scanner = new Scanner(System.in);
			System.out.print("범위의 숫자중 작은 숫자");
			startNum = scanner.nextInt();
			System.out.print("범위의 숫자중 큰 숫자");
			endNum = scanner.nextInt();
						 for (int i =startNum; i <=endNum; i++) {
							sum +=i; 
						 }
		
		System.out.println(startNum+ "~"  + endNum + "까지의 합 :"+ sum);
		
		
				if ( sum % 2 ==0) {
					System.out.println("짝수입니다");
					
				}else {
					System.out.println("홀수입니다");
				}
	}

}
