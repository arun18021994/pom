package automobile;

import weekthree.staticandnonstatic.SampleB;

public class Bus {
	
	public static void steering() {
		//MotorBike obj = new MotorBike(); 
		MotorBike.brake();
	
	}
	protected static String cluthPlate() {
		return null;
	}
	private void suspension() {
	steering();
	
	}
	 int maxSpeed() {
		return 80;
    
	 }
	 int minSpeed() {
		return 10;
	
	 }
	 static void gearBox() {
		 
	 } 
	 protected String bumper() {
		return null;		 
	 }
	 public static void tyre() {
		 MotorBike obj = new MotorBike();
				 obj.minSpeed();
	 }
	 public void passengerCeat() {
		 MotorBike.brake();
	 }
	 protected int tyrePressure() {
		return 40;
		
	 }
}