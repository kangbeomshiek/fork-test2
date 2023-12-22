package com.fon;

public class Calc {

					int dan = 0;
				 	int startNum = 0;									//변수지정
					int endNum =0;
				
					
					
					
					
					public Calc ( ) {											//constructor 지정
						
					}
						
					 
				
							
					

					public Calc(int dan , int startNum , int endNum) {					//값을 받아오고 Field에 넘겨주기
																			
							this.dan = dan;
							this.startNum = startNum;
							this.endNum = endNum;

					}






																//2    //3 //5 


					public void gugu () {
							for ( int i =startNum; i <=endNum; i++) {										//구구단 로직 실행															
								System.out.println(dan + "x" + i + "=" + (dan*i));
							}
						}
	
	
}
