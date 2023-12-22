package com.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					//신장이 가장 크거나 작은 학생의 이름과 신장을 출력하기
		 			String [] name = {"james" , "cathy" , "kenny" , "martin" , "crystal" } ;
		 			
		 			
		 			
		 			
		 			
	                int e = 0;
		 	        int	tot = 0;
		 			double B = 0;
		 			
		 			 int min ;
		 			int max ;
		 		Scanner scanner = new Scanner(System.in);
		 		
		 					for ( int i  = 0;  i < name.length; i++ ) {
		 						
		 						System.out.print( name[i] + "의 신장을 입력하세요 : " );	
		 						
		 				        [e]  =  scanner.nextInt();
		 				        tot += e;
		 				        
		 			//			name[i]  =  scanner.next();      
		 						
//		 				          		System.out.println(name[i]);
//		                         		System.out.println(tot);
		 					 
		 				        	
		 					B = (double)(tot / name.length);
		 						 
		 								if ( e < min ) {
		 									min = e;
		 										
		 								
		 									if ( e >  ) {
		 									   max = e;
		 										
		 									}
		 								}
		 					
		 					
		 							 
		 								 
		 					}
		 					System.out.println("평균 신장은 " + B );
		 					System.out.println("가장 큰 학생은" +  name  + "이고 그 키는" + max );
		 					System.out.println("가장 작은 학생은" +  name  + "이고 그 키는" + min  );
		                        	 		
		 							
		 							
		 					
		 					
		 			
	}

}
