package Demo1;

public class StackTest {
	public void m1() {
		System.out.println("m1 method");
		m2();
	}
	public void m2() {
		System.out.println("m2 method");
		m3();
	}
	public void m3() {
		System.out.println("m3 method");
//		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackTest obj=new StackTest();
		obj.m1();

	}

}
