package com.javalec.function;

public class CalcAll {

	
	
	//Field
	
	
	//constructor
	public CalcAll() {
		// TODO Auto-generated constructor stub
	}
	
	//Method		념겨주지 않고 내가 다 하갰다면 void를 사용
		public void calc( int first ,int second) {
			System.out.println("덧셈 :" + (first + second));
			System.out.println("뺄셈 :" + (first - second));
			System.out.println("곱셈 :" + (first * second));
			System.out.println("나눗셈 :" + ((double)first / second));
		}
	
	
}
