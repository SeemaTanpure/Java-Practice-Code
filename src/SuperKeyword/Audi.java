package SuperKeyword;

public class Audi extends Car{
	public Audi() {
		System.out.println("Audi---default constructor");
	}
	public Audi(int a) {
		super(100);//first call in child class -super	whenever calling constructor
		System.out.println("Audi--constructor "+ a);
	}
	public Audi(int a, int b) {
		super(a, b);
		System.out.println("Audi--constructor "+ (a+b));
		super.start();
		Car.testing();
	}

}
