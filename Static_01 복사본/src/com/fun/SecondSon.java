package com.fun;

public class SecondSon {
	
	

	
	
	public void takeChoco() {
		MamaBag.choco = MamaBag.choco - 1;					//static 을 사용해 class 에 직접 접근을 한다
		
		if ( MamaBag.choco < 0) {
			System.out.println("둘째는 초코파이가 먹고싶어요");
		}else {
			System.out.println("둘째는 맛있게 먹었어요");
			
		}
	}

}
