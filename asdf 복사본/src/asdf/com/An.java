package asdf.com;

import java.util.Scanner;

public class An {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		    for ( int i = 1 ; i <=9; i++) {
//		    	
//		    }
//		    int i =1;
//		    
//		    while (i<=9) {
//		    	i++;
//		    	
//		    }
//		    //	 		num1 	은 1부터 9까지 가
		
	
			Scanner scanner = new Scanner(System.in);					  //출력사용 허락받기
//			int num1;													//변수지정	
//		    int num=0;
//
//		    int tot = 0;
//						  System.out.print("몇개의 숫자를 더할까요 ? ");				//출력문
//						  		num1 = scanner.nextInt();						
//						  	System.out.println(num1 + "개의 숫자를 입력하세요");
//						  	for ( int i = 1; i <=num1; i++)
//						  	         num  =  scanner.nextInt();
//						              	tot += num;
//						  	        	 
//					  		
//						  
//						 
//						  	System.out.println("합계 : 입력한 숫자의 합은 " +tot + "입니다");
		
		//숫자 삼각형에 프로그램 작성하기                   if5를 입력하면 5단 피라미드 출력.
			
		      //   	마지막 숫자가 1 + 2 의 합계에 + 3 의 합계에 +4 .......    n 의 합계의 e + 1을 추가
			
			//1.2.3.4.5 를 입력하면 1번칸에는 한번만 출력하고 2번에는 두번 출력 3번에는 3번출력 ......    n번방에는 n번 출력  
			
//		int num1 =0;
//		int snum;
//		    System.out.print("몇 단계의 피라미드로 구성할까 ? : ");
//		    				num1 = scanner.nextInt();
//		    				for ( int i = 1; i <= num1  ;  i ++ ) {
//		                        	for ( int e =0; e <= i ;  e ++ ) {
//		    	
//		    	}
//		    
//		    	  	System.out.println("5");
//		    	
//		    }
//		
//		
			//몇개의숫자를 입력할지 결정한 후 숫자를 입력하고 이중 최대값의 위치와 최대값을 구하라
//			int num1 =0;							//입력 변수
//			int num=0;								//출력문 여러번 돌리기 위한 변수
						
//			int max =0;								//최대값
//			int maxnums = 0;						//최대의 번지수
//			
//		     System.out.print("입력할 숫자의 갯수 ? (100)개 미만 : ");						//입력문 입력
//		         num1 = scanner.nextInt();									
//		        System.out.println(num1 + "개의 숫자를 입력하세요!");								
//		          for (int i =1; i <= num1 ; i++) {									//여러가지 입력을 받기위한 반복문
//		        	  num   =  scanner.nextInt();  
//		        	  if ( max < num) {													//최대값 구하기
//		        		  max = num;						
//		        		  maxnums = i;													//최대값인 번지수 구하기			
//		        	  }
//		          }
//		           
//			        System.out.println("입력한 숫자중 최대값은 " + max + "이고" + maxnums + "번째 값입니다");
		
			//학생수가 4명이고 과목이 3과목일 경우의 점수 합계와 평균 구하기 기능 추가
			
			
//		    String  [] thing = { "Korean" , "English" , "Mathematics" , "total" , "Average" };
//		    
//		    int num3 =0;
//			int num2 = 0;
//			int num1 = 0;	
//			int etot = 0;
//			int ktot = 0;
//			int mtot = 0;
//			int ea =0;
//			int ka =0;
//			int ma = 0;
//			
//										System.out.println("Korean의 성적을 입력 :");
//										    for ( int i = 1; i <=4; i++ ) {
//										    	System.out.print("No" + i + "의 성적은  :" );
//										    	num1 = scanner.nextInt();
//										    	ktot+=num1;
//										    	ka = ktot/i;
//										    }
//									    System.out.println("English 의 성적을 입력 : ");
//									       for ( int e = 1; e <=4 ; e++) {
//									    	  
//									    	   System.out.print("No" + e + "의 성적은  :" );
//									    	   num2 = scanner.nextInt();
//									    	   etot +=num2;
//									    	   ea = etot/e;
//									       }
//									    System.out.println("Mathematics 의 성적을 입력 : ");
//									      for ( int a = 1; a <= 4; a++) {
//									    	  System.out.print("No" + a + "의 성적은  :" );
//									    	  num3 = scanner.nextInt();
//									    	  mtot += num3;
//									    	  ma = mtot/a;
//									      }
//									         thing[0] = num1;
//
//									      
//		         System.out.print("       Korean           English          Mathematics         total           Average");
//		         System.out.println();
//		         for ( int b =1; b <=4; b++) {
//		       System.out.print("No"+b+              );
//		         	
//		
//		
//		
//		
//		         }
		
		
			//몇 개의 숫자를 입력 할지 결정한 후 숫자를 입력하고 이중 검색을 원하는 숫자의 위치를 파악
//		int num1 =0;	
//		int num =0;
//		int num2 = 0;
//	    int wnum = 0;
//			  System.out.print("입력할 숫자의 갯수? : ");
//			       num1 = scanner.nextInt();
//			       System.out.println(num1 + "개의 숫자를 입력하세요!:");
//			     for ( int i =1; i <= num1; i++) {
//			    	 System.out.print(i + "의 숫자 : " );
//			    	 num = scanner.nextInt();
//			    	  
//			     }
//			
//			     System.out.print("검색할 숫자는? : ");
//			       num2  = scanner.nextInt();
//			       	     for ( int e = 1; e <= num; e++) {
//                             
//			       	    	    
//			       	     }
//			       	     System.out.println(num2 + "의 위치는 " +wnum  + "입니다");
			       			
//			    	 for ( int e =num2; e < num; e++)
//			      if ( num2 == num) {
	
			    	  
//			      }
			       

			       

			    	  
//	           if ( ) 
//			    	   System.out.println(num2 + "는 존재하지 않습니다.");
	
	
			
			//10개의 점수 (0점부터 99점) 를 입력받아 점수의 분포를 10점 간격의 등급으로 된 히스토그램을 표시하라
//			int num1 = 0;
//			String A = "#";												//int [] his = new int [10];
//
//			int tot = 0;
//			String [] shap = { "#" };
//		System.out.println("Input score :");
//		for ( int i =1; i <=10; i++) {
//			System.out.print(i + "의 score :");
//				  num1	= scanner.nextInt();
//		}
//				for ( int a = 0; a <=99; a++) {		
//					if ( num1 % 10 == a ) {
//						tot +=a;
//		        	A =  shap[0]; 
//		        	
//		           }
//		    	          
//		     
//		 
//		
//		
//			System.out.println("-----------Histogram----------");
//		    for ( int e = 90; e >=0;  e-=10) {
//		    	
//		    	System.out.println(String.format("%2d",e ) + ":"  );
//		    }
			
			
			
//			int [] his = new int [10];                 //배열 10칸 지정
//			
//			System.out.println("Input score :");    //입력을 받는 출력문
//			     
//			for ( int i =0; i < his.length; i ++) {            //점수를 입력하는 10가지				
//				System.out.print((i+1) + "의 score :" );
//				 int A = scanner.nextInt();
//				 his [A/10]++;
//			}
//			
//			
//			System.out.println("-----Histogram ------");
//			
//			
//			
//			
//			for ( int i = (his.length - 1);  i >=0; i --) {          //0부터 90 까지 지정
//				System.out.print(String.format("%3d :", i*10));     //범위값을 나타냄
//				 for ( int e = 1; e <= his[i]; e++) {
//					 System.out.print("#");
//				 }
//				 System.out.println();
//			}
			
			
			
			
			
			//몇개의 숫자를 입력할지 결정한 후 숫자를 입력하고 입력된 위치에 새로운 숫자를 삽입.
		int B = 0;	
		int []seet = new int [10];
			
					System.out.print("입력할 숫자의 갯수? :");
					    int A = scanner.nextInt();
					   System.out.println(A + "개의 숫자를 입력하세요!:");
					   for ( int i =1; i<= A; i++) {
					   System.out.print(i + "의 숫자  :" );
					     B = scanner.nextInt();
					   }
					    
			
			             System.out.print("숫자를 삽입하고자 하는 위치는 ? :");
			              int C =    scanner.nextInt();
			              System.out.print("삽입하고자 하는 수는 ? :");
			              int D = scanner.nextInt();
			                  
			                  
			              
			              
			                 
			              
			              
			              
			              		System.out.print("------결과-----");
//			              		System.out.println();
//			              	    for ( int j =B; j <= B+1; j++) {
//			              	    	System.out.println(j);
//			              	    }
//			            
			              
			             
			              
			
			
			
			
			
		
	}

}
