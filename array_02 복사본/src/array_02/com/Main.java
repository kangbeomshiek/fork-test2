package array_02.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
							
		
									//사용자가 입력하는 숫자 5개를 받아 합꼐구하기
		
					Scanner scanner = new Scanner(System.in);
					int [] num =  new int [5];
//					int num2 = 0;
					int tot = 0;
					int Lnum = 0;
					for ( int i = 0; i < num.length; i++) {
							System.out.print((i+1) + "번 숫자를 입력하세요 : ");
						  num[i] = scanner.nextInt();
						  		
						}
						
						
						for (int i = 0; i < num.length; i++) {
								tot += num[i];
								  if ( num[4] == num[i]) {
								    	num[4] = Lnum;
								  
						}
							System.out.println("합 : " + tot);
					        System.out.println("평균 : " + (double)(tot/num.length));
					        System.out.println("최대숫자 : " + Lnum);
					        System.out.println("최소숫자 : " + );
					        
//		  			System.out.print("1번 숫자를 입력하세요 :");
//		  				num1 =scanner.nextInt();
//		  		    System.out.print("2번 숫자를 입력하세요 :");
//		  				num2 =scanner.nextInt();	
		  			
		
		
						
		
		
					
			
					
			
			
			
			
			
			
			
			
		
			
			
	}

}
