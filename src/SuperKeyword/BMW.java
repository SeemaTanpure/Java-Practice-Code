package SuperKeyword;

public class BMW extends Car{
	int speed=300;
	@Override
	public void start() {
		System.out.println("BMW---Start");
		super.start();
		super.refuel();
	}
	public void autoParking() {
		System.out.println("BMW---autoparking");
	}
	public void displaySpeed() {
		System.out.println("BMW speed is: "+speed);
		System.out.println("Car speed is: "+super.speed);//parent speed
		super.testing();
	}

}
