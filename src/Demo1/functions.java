package Demo1;

public class functions {
	public void test() {
		System.out.println("this is test function");
	}
	
	public String getTrainer() {
		System.out.println("get trainer name");
		return "Naveen";
	}
	public int add(int a, int b) {
		int s=a+b;
		System.out.println(s);
		return s;
	
	}
	
	public static void main(String[] args) {
		functions obj=new functions();
		obj.test();
	
		String tr=obj.getTrainer();
		System.out.println(tr);
		// 
		obj.add(20, 230);

	}

}
