package Demo1;

public class SwitchCasePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser= " IE "; 
		switch (browser.toLowerCase().trim()) {//switch is case sensitive & trim to remove spaces
		case "chrome":
			System.out.println("Launch chrome browser:" +browser);
			break;
		case "fireFox":
			System.out.println("Launch FireFox browser:" +browser);
			break;
		case "edge":
			System.out.println("Launch edge browser:" +browser);
			break;
		case "ie":
			System.out.println("Launch ie browser:" +browser);
			break;
		default:
			System.out.println("Please pass the correct browser: " +browser);
			break;
		}

	}

}
