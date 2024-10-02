
public class reverseString {
	public static String reverse(String str) {
//	String input="Hello";
		String Output="";
		for(int i=0; i<str.length(); i++) {
			Output=str.charAt(i)+Output;
		}
		return Output;
	}
	//is String palindrome or not?
	public static boolean isPalindrome(String str) {
		String rev="";
		boolean ans=false;
		for(int i=0; i<str.length();i++) {
			rev=str.charAt(i)+rev;
			}
		if(str.equals(rev)) {
			ans=true;
		}
		return ans;
	}
	
	public static void main(String[] args) {
//		String test=null;
//		try {
//			test = reverse();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		// System.out.println(test); 
		 String str="don";
		 str=str.toLowerCase();
		 boolean A=isPalindrome(str);
		 System.out.println(A);
		 System.out.println("reverse of string "+str+" is: "+reverse(str));
	}
	
}
