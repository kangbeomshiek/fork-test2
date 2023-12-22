package com.base;

import com.fun.PoliceMan;
import com.fun.Xman;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					
		
					System.out.println("X-Man의 역할");
				    Xman xman = new Xman();
				    xman.cachFire();
				    xman.findThing();
				    xman.cachFire();
				    xman.saveMen();
				    xman.makePizza();
				    xman.makeSpaghetti();
				    System.out.println("---------------------");
				    System.out.println("경찰역할");
				    PoliceMan policeMan = new Xman();					//생성자 이름은 기본적으로 XMan 이다
				   policeMan.cathThief();											//XMan생성자는 다른 무었이든 가능하지만 다른 무었은 XMan이 될수없다
				   policeMan.findThing();											//interface 는 생성자가 없지만  기본 생성자가 implements 에 XMan으로서 존재한다
				   																						
				    
				    
				    
				    
				    
				    
	}

}
