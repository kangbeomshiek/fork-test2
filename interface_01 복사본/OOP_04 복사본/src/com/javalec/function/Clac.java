package com.javalec.function;

public class Clac {

					//property , Field  			//클라스 만들때 기본타입은 private.
			public int num1;
			public int num2;
			
	
				//constructor
	
						public Clac() {
							
						}
	
	//Method
			
    public void addAction() {
    	
    	System.out.println("덧셈 :" + (num1 + num2));
        }
	
    public void subAction() {
    	System.out.println("뺄셈 :" + (num1-num2));
    	
    }
    public void mulAction() {
    	System.out.println("곱셈 : " +(num1 * num2));
    }
    public void divAvtion() {
    	System.out.println("나눗셈 :" + ((double)num1 /num2));
    }
    
}
