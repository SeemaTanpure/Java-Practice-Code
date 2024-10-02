package Demo1;

public class addNumberStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a11bcd3ef4";
		int sum=0;
		for(int i=0; i<=s.length()-1; i++) {
			
			char c =s.charAt(i);
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		
		}
		System.out.println(sum);

	}

}
