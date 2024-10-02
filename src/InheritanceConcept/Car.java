package InheritanceConcept;
//final class- to prevent inheritance
public class Car extends Vehicle{
	int speed=100;

	public void start()
	{
		System.out.println("Car---start");
	}
	public void stop() 
	{
		System.out.println("Car----stop");
	}
	//final methods can not be override---prevent methods overriding
	public final void refule() 
	{
		System.out.println("Car----refuel");
	}
	
	//static methods can not be overridden 
	public static void billing()
	{
		System.out.println("Car---billing");
	}
	private void carInfo()
	{
		System.out.println("Car---Info");
	}
	public void getInfo() 
	{	
		System.out.println("Get info");
	}	
	
	public void applyBreak() 
	{
		System.out.println("Car----apply break");
	}
	
}
