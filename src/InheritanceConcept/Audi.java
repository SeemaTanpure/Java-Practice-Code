package InheritanceConcept;

public class Audi extends Car {
	@Override
	public void start() {
		System.out.println("Audi---start");
	}
	public void autoParking() {
		System.out.println("Audi---Autoparking");
	}
	public void theftSafety() {
		System.out.println("Audi---theftSafety");
	}

}
