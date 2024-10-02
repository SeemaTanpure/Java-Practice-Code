package Demo1;

public class Employee {
	String name;
	int age;
	double salary;
	boolean isperm;
	char gender;
	

	public static void main(String[] args) {
		Employee obj=new Employee();
		System.out.println(obj.name);
		// TODO Auto-generated method stub
		obj.name="Pooja";
		obj.age=30;
		obj.salary=45000;
		obj.isperm=true;
		obj.gender='f';
				
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.salary);
		System.out.println(obj.isperm);
		System.out.println(obj.gender);
		Employee e2=new Employee();
//		e2=null;
		e2.name="Suja";
		System.out.println(e2.name);
		

	}

}
