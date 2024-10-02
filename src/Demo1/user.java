package Demo1;

public class user {
	String name;
	String city;
	int age;
	final static int percent =100;
	static final int keys=2;

	public static void main(String[] args) {
		user u1=new user();
		u1.name= "Veena";
		u1.city= "Pune";
		u1.age= 30;
		user u2=new user();
		u2.name="Piyush";
		u2.age= 25;
		u2.city="Mumbai";
		// TODO Auto-generated method stub
		System.out.println(user.percent);
		System.out.println(user.keys);
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		System.out.println(u2.name+" "+u2.age+" "+u2.city);

	}

}
