package com.java;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					//StringBuilder
		
//		 				StringBuilder stringBuilder = new StringBuilder("avcdefg");
//		                						
//		                stringBuilder.append("hijklmn");			//붙이기
//		                stringBuilder.insert(3, "zzz");      //삽입
//		                stringBuilder.delete(3, 6);			//삭제
//		                System.out.println(stringBuilder);
//		                
//		                
//		                
//		                StringBuffer stringBuffer = new StringBuffer("avcdefg");
//		                stringBuffer.append("hijklmn");			//붙이기
//		                stringBuffer.insert(3, "zzz");      //삽입
//		                stringBuffer.delete(3, 6);			//삭제
//		                System.out.println(stringBuffer);
		
		                
		                
		                
		                
		                //calendar     	 
//		                String[] dateName = {"일요일",	"월요일","화요일","수요일","목요일","금요일","토요일"};						//객체
//		              Calendar calendar = Calendar.getInstance();
//		              
//		              int year = calendar.get(calendar.YEAR);
//		              int month = calendar.get(calendar.MONTH) +1;
//		              int day = calendar.get(calendar.DAY_OF_MONTH);
//		              int date = calendar.get(calendar.DAY_OF_WEEK);
//		              int hour = calendar.get(calendar.HOUR);
//		              int minute = calendar.get(calendar.MINUTE);
//		              int second = calendar.get(calendar.SECOND);
//		              
//		              System.out.println(year + "-" + month + "-" +String.format("%02d", day) + "-" + "( " + dateName[date-1]+")");
//		              System.out.println( hour + ":" + minute + ":" + second);
		                
		
		
		//Time 을 이용하여 측정하기
	     String str1 ="a";
//	     long startTime1 = System.currentTimeMillis();
//	     
//	     for ( int i =1; i <=500000; i++) {
//	    	 str1 = str1 + "a";
//	     }																									//속도차이가 엄청난다
//		
//	     long endTime1 = System.currentTimeMillis();
//		   System.out.println("Term1 :" + (endTime1 - startTime1));
//		
		
		  StringBuilder stringBuilder = new StringBuilder("a");
		  
		  long startTime2 = System.currentTimeMillis();
		     
		     for ( int i =1; i <=500000; i++) {
		    	stringBuilder.append("a");
		     }
			
		     long endTime2 = System.currentTimeMillis();
			   System.out.println("Term1 :" + (endTime2 - startTime2));
		
		
		
		
		
		
		
		                
		                
	}

}
