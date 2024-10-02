package ExceptionHandling;

public class TestFinally {
	public static int getMarks(String studentName) {
		if(studentName.equals("Vibha")) {
		try {
			int i=9/0;
		} catch (ArithmeticException e) {
			System.out.println("AE is coming...");
			return 10;
		}
		finally {
			System.out.println("bye!");
			return 80;
		}
				
		}
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
