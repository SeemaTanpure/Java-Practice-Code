package InheritanceConcept;


public class BMW extends Car{
	// Method overriding- Poly-morphism- Run time poly-morphism (Dynamic)
	//when parent & child having same method with same name & same number of parameters
	//1. With the same name.
	//2. with the same number of parameters/variables
	//3. with the same sequence of parameters
	//4. Business logic /number lines of code does not matter.
	//5. with the same return type.
	
	
	@Override
	public void start() {
		System.out.println("BMW---start");
	}
	
	public void Autostart() {
		System.out.println("BMW---Autostart");
	}
	//method hiding
	//Static methods can not be override but it can be overloaded
	//final method can not be override
	public static void billing() {
		System.out.println("BMW---billing");
	}
	@Override
	public void applyBreak() {
		System.out.println("BMW---applybreak");
	}
	
}
