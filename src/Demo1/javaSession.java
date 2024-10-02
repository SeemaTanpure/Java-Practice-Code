package Demo1;

public class javaSession {
	public int getStudentMarks(String name) {
		System.out.println("Print Student name: "+name);
		switch(name.toLowerCase().trim()) {
		case "priya":
			return 90;
		case "ajay":
			return 98;
		case "shikha":
			return 88;
		default:
			System.out.println("Please pass the correct name: "+name);
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javaSession js = new javaSession();
		int marks=js.getStudentMarks("Ajay");
		System.out.println(marks);

	}

}
