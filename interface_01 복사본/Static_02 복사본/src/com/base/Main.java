package com.base;

import java.util.Scanner;

import com.fun.Input;
import com.fun.Output;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ID를 입력하세요 :" );
		String strId = scanner.next();
		System.out.print("PW를 입력하세요 :" );
		String strPw = scanner.next();
		
		Input.id = strId;
		Input.pw = strPw;
		
		System.out.println(Input.e); 
		
		System.out.println("귀하의 ID :" + Output.cheakId());
		System.out.println("귀하의 Pw :" + Output.cheakpw());
		
		
		
			
		
		
		
		
	}

}

