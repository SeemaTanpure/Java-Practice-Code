package Demo1;

public class test2 extends test1{
	public test2() {
		System.out.println("test2 default constructor... ");
	}
	public test2(int a) {
		super();
		System.out.println("test2 constructor... "+a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 t2= new test2(3);
		test1 t1 =new test1(4);
		t2.m1();
		t1.m1();
		
	}

}
