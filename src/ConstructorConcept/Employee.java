package ConstructorConcept;

public class Employee {
	String name;
	int age;
	double salary;
	char gender;
	String dob;
	boolean isperm;
	//Constructor: It looks like a function but its not a function.
	//Constructor name is same as class name
	//Constructor can not return anything, can not be void also, there is no return type
	//avoid writing business logic
	//it is used to initialize the class variables(Instance) with the help of local variables using this keyword
	//Constructor will be called automatically when we create the object of the class
	//constructor will restrict the unnecessary object creation
	//Constructor can be overloaded

	public Employee() {
		System.out.println("default constructor");
	}
	public Employee(int a) {
		System.out.println("1 parameter "+a);
			}
	public Employee(String name, int age) {
		//this.Global=Local(variables)
		this.name=name;
		this.age=age;
	}
	public Employee(String name, int age, double salary, char gender) {
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.gender=gender;
		}
	public Employee(String name, int age, double salary, char gender, String dob, boolean isperm) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
		this.dob = dob;
		this.isperm = isperm;
	}
	public static void main(String[] args) {
		Employee e1=new Employee("Priya", 30);
		Employee e2=new Employee("Sush", 30, 123.11,'F',"12/01/2011",true);
		Employee e3=new Employee("Ameya", 12, 2223.11,'M');
		
		System.out.println(e1.name+" "+e1.age+" "+e1.dob+" "+e1.salary);
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.dob+" "+e2.gender+" "+e2.isperm);
		System.out.println(e3.name+" "+e3.age+" "+e3.salary+" "+e3.gender);
		
		
	
	}

}
