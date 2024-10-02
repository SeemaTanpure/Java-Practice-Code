package Demo1;

public class CallbyRef {
	String name;
	int age;
	
	public void m1(int a) {
		System.out.println(a);
	}
	public static void t1(CallbyRef p1) {
		p1.m1(33);
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.name="Tina";
		p1.age=22;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallbyRef obj=new CallbyRef();
		obj.m1(30);//call by value or argument
		obj.name="Seema";
		obj.age=23;
		CallbyRef.t1(obj);//call by reference
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
