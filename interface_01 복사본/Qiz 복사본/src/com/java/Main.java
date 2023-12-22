package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		// 입력한 숫자부터 4개를 증가하여 화면 가로롤 구구단을 표시하기   (FOR)문 한번만 사용.
					Scanner scanner = new Scanner(System.in);
//					   int num1 =0;    //입력변수지정
//				       int e = 1 ;     
//					System.out.print("Input your number : ");       //입력 받아오기
//					     num1 = scanner.nextInt();
//
//					     for ( int i = num1 ; i <= num1+3 && e < 10 ;  ) {         //구구단 돌리기
//					    	 System.out.print(i + "x" + e + "=" + (i*e) + "\t\t" );   //출력문
//					    	 if ( i  == num1 +3   ) {                                   //구구단 루프 시키기
//					    		e++;
//					    		 i = num1;
//					    		 System.out.println();
//
//
//				    	 } else {   		
//					    		 i++;
//		
//					    	 }
//					     }
					     
					
					
						//배열의 삽입
							int count = 0;  //입력 갯수
							int [] num;   //입력 저장 배열
							int pos =0;    //삽입 위치
						    int posNum = 0;  //삽입 숫자
					      System.out.print("입력할 숫자의 갯수 :");					//  4
					      	count = scanner.nextInt();         					// 4 를 지정	
					      	num = new int [count +1];							// 뒤에서부터 빼줘야 하니 배열 번지수를 +1을 만들어줌
					      	
					      	
					      System.out.println(count + "개의 숫자를 입력하세요.");										
					        
					      	for (int i= 0; i < count; i++) {					      // 배열의 자리수  0,1,2,3 범위      				  
					      		System.out.print((i+1) + "의 숫자 :");					//화면에 출력하는건  1,2,3,4 나오게 하기 위해 i +1 					
					      	   num[i] = scanner.nextInt();      						//입력을     num1 배열 에 저장 
					      	   
					      	   
					      	}
					           System.out.print("숫자를 삽입하고자 하는 위치는 ?");
					           pos =scanner.nextInt(); 											//위치값 지정 
					           																		//
					           System.out.print("삽입 하고자 하는 수는? :");
					      	      posNum = scanner.nextInt();  										//숫자값 지정
					      	      
					      	 //4를 입력했으면 3 이 초기값 위치가 3 이면 2가 될때까지    자리를 -1 만큼 비켜준  
					      	for ( int i = count -1; i>= pos-1; i--) {				//숫자의 자리를한칸 띄고 그 자리에 숫자를 밀어넣기
					      		num[i+1] = num[i];									//그 자리에 들어갓으면 +1 해서자리를 별려줌
					      		
					      	}
					      	   //   위치값 3 의 자리에 숫자 삽입  																								 0,1 ,2,3    	2
					
					      	    num[pos-1] = posNum;   								//위치에  입력한 숫자 삽입
					      	    
					      	      
					      	    System.out.println("-----결과-----");  
					      	
					       for (int i= 0; i<count+1; i++) {
					            System.out.println(num[i]);
					   }
					
				    int count = 0;    //입력갯수 
				    int []num;        //입력 저장 배열
				   int pos = 0;       //입력 위치 변수
					System.out.print("입력할 숫자의 갯수 :");						
					  count = scanner.nextInt();  					//입력값 받기     4
					  
					   	num = new int [count ];         //배열의 자리를 지정
			      	
				      System.out.println(count + "개의 숫자를 입력하세요."); 			      	//숫자 입력
				           
				      	for (int i= 0; i < count; i++) {
				      		System.out.print((i+1) + "의 숫자 :");  						//입력한 숫자를 배열에 지정
				      	   num[i] = scanner.nextInt();
				      	}  	   
					   System.out.print("몇번째의 숫자를 삭제 하시겠습니까? :");
					   
					   					   					   
					           pos = scanner.nextInt();									// 삭제할 위치 지정   2
					       //초기값은 배열의 자리 4개  i가삭제할 위치까지 i가 감소
					       for ( int i = count; i >= pos; i--) {
					    	    										//삭제할 자리를 찾으면    				1,2,3,4 에서 2 를삭제     1, ,3,4 가 나오고 3,4 에 -1 씩 해서자리 채우기
					    	
					    	count = num[i-1];  
					    	  
					    	   
					         }
					           
					           System.out.println("-----결과-----");
					           
					           for ( int i =0; i <count ; i++) {
					        	   System.out.println(num[i]);
					           }
//					           
//					           
					
					//고객의 입금 출금 및 현황을 관리하는 프로그램을 작성하라 ( 고객명은 1,2,3,4)
   
					/*
					 * 1. 입금
					 * 2. 출금
					 * 3. 현황
					 * 4. 종료
					 *번호를 선택하세요! :
					 고객번호 : 
					금액 : 
			
					 */
//					int i = 0;
//					int a = 0;
//					int p1tot = 0;
//			        
//			        int [] B =new int [4];
//			        
//			        		
//			        while (true) {
//					System.out.println("1. 입금");
//					System.out.println("2. 출금");
//					System.out.println("3. 현황");
//					System.out.println("4. 종료");
//					System.out.print("번호를 선택하세요!");
//					i = scanner.nextInt();
//				
//			        }
//			         
//			        	if (  == 1) {
//					    	System.out.print("고객 번호 :");
//					       a = scanner.nextInt();
//					       System.out.print("금액 :");
//					        B[i]  = scanner.nextInt();
//					        System.out.print(B[i]);
//					         
//			        	
			        	
					      
					            
						 
							
						
						
							
   					
				  
//					   System.out.print("고객 번호 : " );
//					   P1 = scanner.nextInt();
//					   System.out.print("금액 :"  );
//					   p1 = scanner.nextInt();
//					   p1tot +=p1;
//					   System.out.print("입금 결과 : 고객번호 :1 잔액 :" + p1tot);
					
					 
					     
					     
				   
					   
				    	
				
					
					
					
	
					
	
					
					
				      		    	 
	}

}
