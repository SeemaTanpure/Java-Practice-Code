package Assignments;

public class Methods {
	public static void Add(int a, int b) {
		int c=a+b;
		System.out.println("Addition of integers: "+c);
	
	}
	public static void Sub(int a, int b) {
		int c=a-b;
		System.out.println("Subtraction of integers: "+c);
	}
	public static void Mult(int a, int b) {
		int c=a*b;
		System.out.println("Multiplication of integers: "+c);
	}
	public static void Div(int a, int b) {
		int c=a/b;
		System.out.println("Division of integers: "+c);
	}
	public static void Product(double a, double b) {
		double c=a*b;
		System.out.println("Product of doubles: "+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add(4, 5);
		Sub(5, 2);
		Mult(3, 5);
		Div(4, 2);
		Product(2.3, 5.2);

	}

}
