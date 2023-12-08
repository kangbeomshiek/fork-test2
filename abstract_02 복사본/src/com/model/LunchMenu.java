package com.model;

public abstract class LunchMenu {

	 	public int rice;
	 	public int bulgogi;
	 	public int banana;							//모델에서 데이터를 다 잡아줘야 한다
	 	public int milk;
	 	public int almond;
	 	
	 	
	 	public LunchMenu() {
			// TODO Auto-generated constructor stub
		}


		public LunchMenu(int rice, int bulgogi, int banana, int milk, int almond) {
			super();
			this.rice = rice;
			this.bulgogi = bulgogi;
			this.banana = banana;
			this.milk = milk;
			this.almond = almond;
		}
	 	
	 	
	 	public abstract int calc();
	 	
	 	
}
