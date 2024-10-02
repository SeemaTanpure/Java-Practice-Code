package Assignments;

public class Assignment4 {
	public static void evenOddNumber(int a) {
	
		if(a%2==0) {
			System.out.println("Given number is even: "+a);
		}
		else {
			System.out.println("Given number is odd: "+a);
		}
	
	}

	public static void main(String[] args) {
		// check if number is +ve or -ve
		
		int num =123;
		if(num<0) {
			System.out.println("Number is Negative: "+num);
			}
		else if (num==0) {
			System.out.println("Number is Zero: "+num);
			}
		else {
			System.out.println("Number is Positive: "+num);
		}
		
		//		Check if number is odd or even
//		Assignment4 obj=new Assignment4();
//		obj.evenOddNumber(14);
		evenOddNumber(9);// can call method directly w/o object using static keyword in method
		
	}

}
