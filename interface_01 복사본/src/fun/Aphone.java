package fun;

import model.SmartPhone;
				 //다중상속이 가능하다
public class Aphone implements SmartPhone {

	@Override
	public void callSenderReceiver() {
		// TODO Auto-generated method stub
			System.out.println("A Phone : Possible");
	}

	@Override
	public void telMethod() {
		// TODO Auto-generated method stub
			System.out.println("A Phone : 3G");
	}

	@Override
	public void tvRemoteController() {
		// TODO Auto-generated method stub
			System.out.println("A Phone : Not Applied");
			
	}

}
