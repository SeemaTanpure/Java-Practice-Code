package ConstructorConcept;

public class Car {
	String name;
	String color;
	double price;
	String model;
	String chasisNumber;
	

	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Car(String name, String color, double price) {
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public Car(String name, String color, double price, String model, String chasisNumber) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.model = model;
		this.chasisNumber = chasisNumber;
	}
	public static void main(String[] args) {
			Car c1=new Car("Audi", "Red");
			Car c2=new Car("BMW","White",234211, "MAX12", "12213");
			
			System.out.println(c1.name+" "+c1.color);
			System.out.println(c2.name+" "+c2.color+" "+c2.model+" "+c2.price+" "+c2.chasisNumber);

	}

}
