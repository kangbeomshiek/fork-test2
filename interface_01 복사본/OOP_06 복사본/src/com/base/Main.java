package com.base;

import java.util.Scanner;

import com.fon.Calc;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int dan =0;
			int startNum;
			int endNum;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("구구단 몇단을 출력할까요? (단, 시작수 , 끝수)");
		dan = scanner.nextInt();
		startNum =scanner.nextInt();
		endNum = scanner.nextInt();
		
		
		
		Calc calc =new Calc(dan, startNum, endNum);
		calc.gugu();
		
		
		
	}

}
