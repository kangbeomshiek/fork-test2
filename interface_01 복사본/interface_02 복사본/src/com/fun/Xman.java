package com.fun;

public class Xman implements PoliceMan, FireFighter, Cooker {							

				
	
	
	@Override
	public void makePizza() {
		// TODO Auto-generated method stub									
		System.out.println("피자 요리");
	}

	@Override
	public void makeSpaghetti() {
		// TODO Auto-generated method stub
		System.out.println("스파게티 요리");
	}

	@Override
	public void cachFire() {
		// TODO Auto-generated method stub
		System.out.println("화재 진압");
	}
	
	public void saveMen() {
	 System.out.println("생명 보호");
	}
	

	@Override
	public void cathThief() {
		// TODO Auto-generated method stub
		System.out.println("범인 검거");
	}

	@Override
	public void findThing() {
		// TODO Auto-generated method stub
		System.out.println("분실물건 보관");
	}

							
			
	
	
}
