package Demo1;

public class EmployeeSheet {
	//Polymorphism-many forms, Method overloading, static
	//Method overloading- Compile time poly-morphism, 
	//Within the same class if we have multiple methods
	//1. same method name
	//2. with different number of parameter
	//3. With the different sequence of parameters (if parameters are the same)
	//return type does not matter
	// Will be used for same functionality like Login, search, payments
	
	public int test() {
		System.out.println("method 1");
		return 100;	
		
	}
 	public double test(int a) {
 		 System.out.println("method 2");
 		 return 12.20;
		}
 	public void test(String x, String y) {
 		System.out.println(x+" "+y);
 		System.out.println("method 3");
	 
 	}
 	public void test(int a, int b) {
 		System.out.println("method 4");
 		
 	}
 	public void test(String s, int a) {
 		System.out.println("method 5");
 	}
 	//use cases: login
 	public void login() {
 		System.out.println("Login");
 	}
 	public void login(String un, String pwd) {
 		System.out.println("Login using username & password: "+un+" "+pwd);
 	}
 	public void login(String un,String pwd, String opt) {
 		System.out.println("Login using Username, Password, OTP");
 	}
 	//Search: 
 	public void search() {
 		System.out.println("Search function");
 	}
 	public void search(String keyword) {
 		System.out.println("Search with keyword");
 	}
 	public void search(String name, String color) {
 		System.out.println("Search function");
 	}
 	public void search(String name, String color, String price) {
 		System.out.println("Search with: "+name+" "+color+" "+price);
 	}
 	//Uber carbooking:
 	public void carBooking(String srtPoint, String endPoint) {
 		System.out.println("Uber car booking: "+" "+srtPoint+" to "+endPoint);
 	}
 	public void carBooking(String carType, String srtPoint, String endPoint) {
 		System.out.println("Uber car booking: "+carType+" "+srtPoint+" to "+endPoint);
 	}
 	public void carBooking(String carType, String srtPoint, String endPoint, int passengers) {
 		System.out.println("Uber car booking: "+carType+" "+srtPoint+" to "+endPoint+" "+passengers);
 	}
 	//Income tax caln:
 	public double calculateTax(int totalIncome, int bonus, int stocksProfit) {
 		System.out.println("Calculatating tax..");
 		double totalTax= (totalIncome*30)/100+bonus+(stocksProfit*2)/100;
 		return totalTax;
 		}
 	public double calculateTax(int totalIncome, int bonus) {
 		System.out.println("Calculatating tax..");
 		double totalTax= (totalIncome*30)/100+bonus;
 		return totalTax;
 		}
 
	public static void main(String[] args) {
		EmployeeSheet obj=new EmployeeSheet();
		obj.test("naveen", 34);
		obj.test("Ameya", "Arnav");
		
		obj.login();
		obj.login("Seema.more", "test@123");
		obj.search("Tshirt","black","500");
		obj.carBooking("sedan", "Home", "Vanaz metro station", 2);
		obj.carBooking("Songbird Tower 11 Bhugaon", "Pashan Pune");
		
		double tax= obj.calculateTax(5000, 250);
		System.out.println(tax);
	}

}
