package WebDriverArch;

public class AmazonTest {
	static WebDriver driver;
	public static void main(String[] args) {
		
//		ChromeDriver driver= new ChromeDriver();
		
//		FireFoxDriver driver=new FireFoxDriver();
//		SafariDriver driver=new SafariDriver();
		String browserName= "Safari";
		WebDriver driver=null;
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "firefox":
			driver=new FireFoxDriver();
			break;
		case "safari":
			driver=new SafariDriver();
			break;

		default:
			System.out.println("Plz pass correct browser name: "+browserName);
			break;
		}
		
		
		driver.get("https://google.com");
		String title= driver.getTitle();
		System.out.println(title);
		driver.sendKeys("Searchfield", "NaveenAutomationLabs");
		driver.click("SearchIcon");
		
			
	}

}
