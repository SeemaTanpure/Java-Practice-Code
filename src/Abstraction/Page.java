package Abstraction;

public abstract class Page extends WebSite {
	
	public Page() {
		System.out.println("default---parent");
	}
	
	public abstract void title();
	public abstract void url();
	//can not create object of abstrace class
	//can we create constructor of abstract class-YES
	//COnstructor will be called when u create object of child class
	
	public void loading() {
		System.out.println("page loading in 20 sec");
	}
	public final void displayLogo() {
		System.out.println("mylog.png");
		
	}

}
