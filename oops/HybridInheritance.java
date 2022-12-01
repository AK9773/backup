package oops;

class Vehicles{
	
	public void m1() {
		System.out.println("Vehicles");
	}
	
}
class FourWheeler extends Vehicles{
	
}
class Cars extends FourWheeler{
	
}
class Buses extends FourWheeler{
	
}
class MotorCycle extends Vehicles{

	@Override
	public void m1() {
		System.out.println("MotorCycle");
	}
	
}
public class HybridInheritance {
	public static void main(String[] args) {
		Vehicles v= new Vehicles();
		v.m1();
		Vehicles v1= new MotorCycle();
		v1.m1();
	}
}
