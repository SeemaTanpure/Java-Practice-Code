package Demo1;

public class IfElseProgs {

	public static void main(String[] args) {
		short a =30;
		short b=20;
		if(a>b) {
			System.out.println("a is gr than b");
		}
		else 
			System.out.println("b is gr than a");
		// TODO Auto-generated method stub
		String browser=" Chrome ";
		if(browser.equals("chrome")) {
			System.out.println("browser is chrome");
		}
		else if(browser.equals("firefox")) {
			System.out.println("browser is FF");
		}
		else {
			System.out.println("please select right browser:" +browser);
		}

	}

}
