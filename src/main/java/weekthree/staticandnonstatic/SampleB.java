package weekthree.staticandnonstatic;

import automobile.Bus;
import automobile.MotorBike;

public class SampleB extends MotorBike {

	
	public static String methodE() {
		return null;
	
	}
	private void methodF() {
		SampleA.methodD();
		methodH();
		Bus.steering();
		MotorBike dri = new MotorBike();
		dri.stand();
		dri.onEngine();//for this protected method i used inheritance..
		
		
	}
	protected void methodG() {
		
	SampleA.methodB();
	SampleA obj = new SampleA();
	obj.methodA();
	}
	public static int methodH() {
		
		
		SampleB obj = new SampleB();
		obj.methodF();
		return 0;
		
	}
	
	
	
	
	
	
	
}
