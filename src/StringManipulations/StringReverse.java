package StringManipulations;

public class StringReverse {
	public static String reverse(String st) {
		if (st==null) {
			throw new RuntimeException("Value can not be Null");
		}
		
		if(st.length()==1||st.length()==0)
		{
			return st;
		}	
		int len=st.length();
		String rev= "";
		for(int i=len-1;i>=0;i--) {
			rev=rev+st.charAt(i);
			}
		return rev;
		
	}

	public static void main(String[] args) {
		String str="selenium";
		String m1= reverse(str);
		System.out.println(m1);
		//TC with data
		System.out.println(reverse("testing"));
		System.out.println(reverse("T"));
//		System.out.println(reverse(null));

	}

}
