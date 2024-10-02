package SuperKeyword;

public class TestCar {

	public static void main(String[] args) {
		BMW b=new BMW();
		b.start();
		b.displaySpeed();
		// TODO Auto-generated method stub
		
		Audi au= new Audi(10,20);
		au.refuel();
		System.out.println("-------------------");
		
		Honda h=new Honda(10);
		
		

	}

}
