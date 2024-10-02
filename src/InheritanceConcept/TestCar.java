package InheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		 
		BMW b= new BMW();
		b.start();//Override
		b.stop();//inherited
		b.refule();//inherited
		b.Autostart();//Override
//  	b.billing();
		b.getInfo();
		b.engine();
		
		
		System.out.println("BMW speed is: "+b.speed);
			
		Car c=new Car();
		c.start();
		c.stop();
		c.refule();
//		c.billing();
		c.getInfo();
		
		Audi au=new Audi();
		au.start();
		au.autoParking();
		au.refule();
		au.theftSafety();//individual 
		
		Car c1=new BMW();
		c1.start();
		
	}

}
