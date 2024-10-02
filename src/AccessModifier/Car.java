package AccessModifier;

public class Car {
	String name;//data member -variables & method rule is same
	public int price;
	protected String color;
	private String chasisNum;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.chasisNum="2002";
		System.out.println(c.chasisNum);

	}

}
