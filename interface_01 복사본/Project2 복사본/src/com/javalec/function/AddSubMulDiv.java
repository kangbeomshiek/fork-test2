package com.javalec.function;

public class AddSubMulDiv extends AddSubMul {
	
/*
	 * Description : AddSubMul로부터 상속받아 덧셈 + 뺼셈 + 곱셈 + 나눗셈을 출력하는 프로그램
	 * Date : 23.12.07.Thursday
	 * Version : 1.0
	 * Author : Woody Jo
 */
	
	
	// Field
	
	int div;
	int firstNum;
	int secondNum;
	
	// Constructor
	public AddSubMulDiv () {
		
	}
	
	
	
	// Method
	public void addSubMulDiv (int firstNum, int secondNum) {
		div = firstNum / secondNum;
		
		System.out.println(AddSubMul.add + AddSubMul.addSub + AddSubMul.addSubMul + div);
	}
	
	
	

}