package Assignments;

public class UberCarSwichCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Cartype=" Sedan ";
		
		switch(Cartype.toLowerCase().trim()) {
		
		case "mini":
			System.out.println("Cartype is mini");
			break;
		case "sedan":
			System.out.println("Cartype is sedan");
			break;
		case "suv":
			System.out.println("Cartype is suv");
			break;	
		case "premium":
			System.out.println("Cartype is premium");
			break;	
		default:
			System.out.println("Please select correct cartype: "+Cartype);
			break;
			
			
			
			
		
		}

				

	}

}
