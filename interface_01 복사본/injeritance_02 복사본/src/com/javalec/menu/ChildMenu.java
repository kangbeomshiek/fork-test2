package com.javalec.menu;

public class ChildMenu extends ParentsMenu {
									
								
				//Field
	
	
	
	
	
				//constructor
					public ChildMenu() {
						// TODO Auto-generated constructor stub
					}
						
							
						
	
				//Method
					public void makeBeefChung() {
						System.out.println("쇠고기 청국장");
					}
					public void makeHotDoen() {
						System.out.println("얼큰 된장국");
					}
					public void makeKongNa() {
						System.out.println("콩나물국");
					}
					
		@Override														//두개있는걸 우선적으로 뽑게하면 하는 표시
	    public void makeChung() {
	    	System.out.println("냄세없는 청국장");
	    }
	
}
