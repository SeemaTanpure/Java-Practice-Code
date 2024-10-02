package WebDriverArch;

public class FireFoxDriver implements WebDriver {
	
	public FireFoxDriver() {
		System.out.println("Launch FireFox browser");
	}

	@Override
	public void get(String url) {
		System.out.println("entering url:"+url);
		
	}

	@Override
	public String getTitle() {
		return "Google";
	}

	@Override
	public void click(String element) {
		System.out.println("clicking on element:"+element);
	}

	@Override
	public void sendKeys(String element, String value) {
		System.out.println("entering element"+element+"into field:"+value);
	}

	@Override
	public void close() {
		System.out.println("closing browser");
		
	}


}
