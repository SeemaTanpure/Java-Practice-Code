package Demo1;

public class Cricket {
	String name;
	int age;
	String team_name;
	String DOB;
	float strike_rate;
	static char gender='M';
	
	public static void main(String[] args) {
		Cricket p1 =new Cricket();
		p1.name= "Sachin Tendulkar";
		p1.age= 35;
		p1.team_name= "MI";
		p1.DOB= "01/07/1988";
		p1.strike_rate=89.91f;
		
		Cricket p2 =new Cricket();
		p2.name= "Rohit Sharma";
		p2.age=33;
		p2.team_name= "KKR";
		p2.DOB= "2/05/1991";
		p2.strike_rate=79.31f;
		
		Cricket p3 =new Cricket();
		p3.name= "Ajay Jadeja";
		p3.age= 35;
		p3.team_name= "CSK";
		p3.DOB= "31/12/1989";
		p3.strike_rate=99.11f;
		
		System.out.println(p1.name+" "+p1.age+" "+p1.team_name+" "+p1.DOB+" "+p1.strike_rate+" "+Cricket.gender);
		System.out.println(p2.name+" "+p2.age+" "+p2.team_name+" "+p2.DOB+" "+p2.strike_rate+" "+Cricket.gender);
		System.out.println(p3.name+" "+p3.age+" "+p3.team_name+" "+p3.DOB+" "+p3.strike_rate+" "+Cricket.gender);
//		print using for each
		
	}

}
