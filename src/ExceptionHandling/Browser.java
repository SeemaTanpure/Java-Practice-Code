package ExceptionHandling;

public class Browser {

	public void m1() 
	{
		System.out.println("m1 method");
		m2();
	}
	public void m2() 
	{
		System.out.println("m2 method");
		m3();
	}
	public void m3() 
	{
		System.out.println("m3 method");
		int i = 9/0;
		
	}
	public static void main(String[] args) 
	{
		Browser br =new Browser();
		br.m3();
	}

}
