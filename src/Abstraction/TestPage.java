package Abstraction;

public class TestPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage lp1=new LoginPage();
		lp1.displayLogo();
		lp1.doLogin();
		//can not create the object of abstract class
		//top casting- child class object can be referred by abstract 
		Page pg= new LoginPage();
		pg.title();
		pg.url();
		pg.loading();
		pg.WebsiteURL();

	}

}
