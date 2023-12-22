package base;

import fun.Aphone;
import fun.Bphone;
import fun.Cphone;
import model.SmartPhone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Aphone A = new Aphone();
			Bphone B = new Bphone();
			Cphone C = new Cphone();
			
			
		
			SmartPhone[] smartPhone = {A,B,C};
			for( int i=0; i<smartPhone.length; i++) {
			
				smartPhone[i].callSenderReceiver();				
				smartPhone[i].callSenderReceiver();
				smartPhone[i].callSenderReceiver();
				
			}
	}

}
