package Demo1;

public class Browser {
	public void click(String element) {
		System.out.println("click on element "+element);
	}
	public void sendKeys(String element, String value ) {
		System.out.println("entering value "+value+" in to the element "+element);
	}
	public String getTitle() {
		return "Google";
	}
//WAF : Launch browser, browsername: chrome, IE, firefox
	//return success mesg, boolean: true/false
	
	
	public boolean launchBrowser(String browserName) {
		System.out.println("browser name: "+browserName);
		boolean flag=true;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			System.out.println("launch chrome");
			break;
		case "firefox":
			System.out.println("launch firefox");
			break;
		case "edge":
			System.out.println("launch edge");
			break;
		default:
			System.out.println("Please pass right browser name: "+browserName);
			flag=false;
			break;
		}
		return flag;
		}
	
	public void getNumber(int a) {
		System.out.println("print int "+a);
	}
	
	public void getNumber(byte a) {
		System.out.println("print byte "+a);
	}

	public static void main(String[] args) {
		Browser br=new Browser();
		boolean exec=br.launchBrowser("Edge");
		System.out.println(exec);
		if(exec) {
			System.out.println("enter the url");
		}
		
		br.getNumber((byte)100); //calling getNumber method: method overloading
	}

}
