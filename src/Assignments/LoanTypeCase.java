package Assignments;

public class LoanTypeCase {

	public static void main(String[] args) {
		// Loan type
		String loantype="car loan";
		double salary=30000;
		double interestRate=0.0;
		
		switch(loantype) {
		case "car loan":
			interestRate=6.5;
			break;
		case "Housing Loan":
			if (salary>35000) {
				
				System.out.println("not applicable for housing loan");
			}
			interestRate=7.5;
			break;
		case "personal loan":
			interestRate=10.00;
			break;
		case "Education loan":
			interestRate=5.8;
			break;
		default:
			System.out.println("Please select correct loan type");
			
		}
		System.out.println("Interest Rate for "+loantype+" is "+interestRate+"%");
		

	}

}
