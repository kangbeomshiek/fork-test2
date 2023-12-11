package com.fun;

public class MazinggaToyClass implements Missle, MoveArmLeg{

	
	public MazinggaToyClass() {
		// TODO Auto-generated constructor stub
			System.out.println("마징가 입니다.");
			canMoveArmLeg();
			canMissle();
			System.out.println("================");
			
	}
		
	
	
	
	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("팔,다리를 움직일 수 있습니다.");
		
	}

	@Override
	public void canMissle() {
		// TODO Auto-generated method stub
		System.out.println("미사일을 발사 할 수 있습니다.");
		
	}

	
	
	
}
