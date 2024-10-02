package BuilderPattern;

public class Application {
	public Application login() {
		System.out.println("Login to app");
		return this;
	}
	public Application login(String un, String pwd) {
		System.out.println("Login to app using:"+un+""+pwd);
		return this;
	}
	public Application search(String productName) {
		System.out.println("Search for Product"+productName);
		return this;
	}
	
	
	
	

}
