package Encapsulation;

public class Browser {
	public void launchBrowser() {
		System.out.println("Launching browser");
		checkRAMSize();
		checkBrowserUpdates();
		verifyStorage();
		checkBrowserPolicy();
		
	}
	private void checkRAMSize() {
		System.out.println("Check RAM size");
	}
	private void checkBrowserUpdates() {
		System.out.println("Check Browser Updates");
		}
	private void verifyStorage() {
		System.out.println("Check Storage");
	}
	private void checkBrowserPolicy() {
		System.out.println("Check Browser Policy");
	}

}
