package Encapsulation;

public class TestEmp {

	public static void main(String[] args) {
//		Employee emp= new Employee();
//		emp.setName("Tim");
//		String n = emp.getName();
//		System.out.println(n);
//		emp.setAge(23);
//		System.out.println(emp.getAge());
		//Create- POST
		Employee obj =new Employee("Pooja", 23, 12.50, true);
		//Retrieve- GET
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPerm());
		//Update- PUT
		obj.setAge(24);
		obj.setSalary(21.15);
		//Retrieve- GET
		System.out.println(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.isPerm());
		//browser
		Browser br=new Browser();
		br.launchBrowser();
		
		//LoginPage
		//create- POST
		LoginPage lp1=new LoginPage("seema.more@test.com", "test@123");
		lp1.doLogin();
		System.out.println(lp1.getUsername()+" "+lp1.getPassword()) ;
		//Update-PUT use setter method
		lp1.setPassword("Seema@3210");
		//retrieve -GET
		System.out.println(lp1.getUsername()+" "+lp1.getPassword()) ;
		
		
		

	}

}
