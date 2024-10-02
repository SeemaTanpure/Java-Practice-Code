package Abstraction;

public class LoginPage extends Page{
	
	//default constructor should be there in parent , child class if parameterized constructor in parent class
	public LoginPage() {
		System.out.println("default---child");
	}

	@Override
	public void title() {
		System.out.println("Login page title");
	}

	@Override
	public void url() {
		System.out.println("Login page URL");
		
	}
	@Override
	public void loading() {
		System.out.println("Login page loading  5Sec");
	}
	public void doLogin() {
		System.out.println("Do login");
	}

	@Override
	public void WebsiteURL() {
		System.out.println("Website URL");
	}
	

}
