package SuperKeyword;

public class Browser implements Automation {
	String name;
	double version;
	
	public void addBrowser(String name, double version) {
		this.name=name;
		this.version=version;
		System.out.println("Browsername:"+name+"Version"+version);
		System.out.println(Automation.TIME);
		billing();
		Automation.super.billing();		//if you've multiple interfaces then use this to differentiate
	}

	public static void main(String[] args) {
		Browser br=new Browser();
		br.addBrowser("Chrome",23.2);
		
	}

}
