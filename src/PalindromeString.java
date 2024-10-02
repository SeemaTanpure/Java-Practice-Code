
public class PalindromeString {

	public static void main(String[] args) {
		String str="amadam";
		StringBuilder rev=new StringBuilder();
		rev.reverse();
		if(str.equals(rev.toString())){
			System.out.println("String is palindrome: "+str);
			
		}
		else
			System.out.println("String is not palindrome: "+str);
		

	}

}
