package SuperKeyword;

public class Car extends Vehicle {
	int speed= 100;
	
	public Car() {
		System.out.println("Car--default constructor");
	}
	public Car(int a) {
		System.out.println("Car constructor "+ a);
	}
	public Car(int a, int b) {
		System.out.println("Car constructor "+ (a+b));
	}
	public void start() {
		System.out.println("Car---start");
	}
	public void stop() {
		System.out.println("Car---stop");
	}
	public void refuel() {
		System.out.println("Car---refuel");
		}
	public static void testing() {
		System.out.println("Car---testing");
	}
	
	//Super: 
	//1. is used to call parent class constructor from child class constructor
	//2. But it used to first statement in child class constr
	//3. is used to call parent class method/variable in the child class.
	//4. if child class has overridden method start(), and if i want to call parent class (start) method:
	//we have to use super.start();
	//5. if immediate parent has no properties(vars/methods) super can be used to call grand parents methods/variable.
	
	//This:
	//1. is used for initialize the class variable(global) with local variable.
	//can be used in the methods/constructors.
	//can be used in same class for same class constructor ...calling
	//this() in constructor should be the first statement.
	//this() & super() can be together.
	//recursive constructor calling is not allowed.
	//we can return this keyword from a function/method.- Builder pattern
	
	
	
}
