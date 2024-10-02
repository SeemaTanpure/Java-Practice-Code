package ExceptionHandling;

public class Employee {
	String name;

	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");	 
		try {
			Employee e = new Employee();
//			e=null;
			e.name ="Seema";
			
			int i=9/0;
			System.out.println("Hello");
		}
		catch (NullPointerException e) {
			System.out.println("NPE coming....");
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception coming");
			e.printStackTrace();
		}
		System.out.println("Bye");
		}

}
