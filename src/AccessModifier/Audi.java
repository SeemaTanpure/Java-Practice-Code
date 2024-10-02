package AccessModifier;

public class Audi extends Car{

	public static void main(String[] args) {
		Audi au=new Audi();
		au.color="red";
		Car c=new Car();
		c.color="Yellow";
		c.name= "MX20";
		au.price= 324233;
		System.out.println(au.color);
		System.out.println(c.color);
		System.out.println(au.price);
		
	

	}

}
