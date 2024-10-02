package SuperKeyword;

public class Honda extends Car{
	public Honda() {
		this(10);
		System.out.println("Honda--default constructor");
	}
	public Honda(int a) {
		this(10, 20);
		System.out.println("Honda constructor "+ a);
	}
	public Honda(int a, int b) {
		System.out.println("Honda constructor "+ (a+b));
	}

}
