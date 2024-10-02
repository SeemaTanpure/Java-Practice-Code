package ExceptionHandling;

public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="c1hrome";
		switch (browser) {
		case "chrome":
			System.out.println("Launch chrome..");
			break;
		case "firefox":
			System.out.println("Launch firefox..");
			break;


		default:
			System.out.println("please pass correct browser name"+browser);
			throw new Myexception("Wrong browser passed");
			//break;
		}

	}

}
