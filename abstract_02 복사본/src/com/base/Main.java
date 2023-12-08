package com.base;

import com.fun.Child1;
import com.fun.Child2;
import com.fun.Child3;
import com.model.LunchMenu;
import com.model.PricTable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				LunchMenu child1 = new Child1(PricTable.RICE,PricTable.BULGOGI,PricTable.BANANA,PricTable.MILK,PricTable.ALMOND);
				LunchMenu child2 = new Child2(PricTable.RICE,PricTable.BULGOGI,PricTable.BANANA,PricTable.MILK,PricTable.ALMOND);
				LunchMenu child3 = new Child3(PricTable.RICE,PricTable.BULGOGI,PricTable.BANANA,PricTable.MILK,PricTable.ALMOND);
					
			
				System.out.println("child1의 식대 :" + child1.calc());
				System.out.println("child2의 식대 :" + child2.calc());
				System.out.println("child3의 식대 :" + child3.calc());
		
	}

}
