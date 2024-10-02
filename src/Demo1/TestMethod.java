package Demo1;

public class TestMethod {
	public void getMail() {
		System.out.println("get mail");
		
	}
	public static void sendMail() {
		System.out.println("send mail");
	}

	public static void main(String[] args) {
		// How to call static method : 1)using class name with the same class

		TestMethod.sendMail();
		sendMail();//calling using object is not recommended for static method
		//for non static method:2)we need to create object
	TestMethod obj=new TestMethod();
	obj.getMail();
	
	}

}
