package com.javalec.base;

import java.util.Scanner;

import com.javalec.function.Calc;
import com.javalec.function.CalcAll;
import com.javalec.function.CalcEach;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner scanner = new Scanner(System.in);
				int firstNum =0;
				int secondNum = 0;
				Calc calc =new Calc();
				CalcAll all = new CalcAll();
				CalcEach each =new CalcEach();
				
				
			System.out.println("1번 숫자를 입력하세요 :");
			firstNum = scanner.nextInt();
			System.out.println("1번 숫자를 입력하세요 :");
			secondNum = scanner.nextInt();
			
			System.out.println("덧셈 결과 :" + calc.addAction(firstNum, secondNum));
			System.out.println("뺄셈 결과 :" + calc.subAction(firstNum, secondNum));
			System.out.println("곱셈 결과 :" + calc.mulAction(firstNum, secondNum));
			System.out.println("나눗셈 결과 :" + calc.divAction(firstNum, secondNum));
			
			
			//-------
			System.out.println("-------");
			all.calc(firstNum, secondNum);
			
			System.out.println("------");
			each.calc4(firstNum, secondNum);
			each.calc3(firstNum, secondNum);
			
			
	}

}
