package Demo1;

public class Students {
//	int marks;
	public int getStudentMarks(String name) {
		
		if(name.equalsIgnoreCase("piyush")) {
			return 90;
		}
		else if(name.equalsIgnoreCase("Sam")) {
			return 84;
		}
		else {
			System.out.println("Please pass correct name "+name);
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students obj=new Students();
		int marks=obj.getStudentMarks("Piyush");
		System.out.println(marks);

	}

}
