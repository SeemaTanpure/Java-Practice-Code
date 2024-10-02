package StringManipulations;

public class StringIntern {

	public static void main(String[] args) {
		String s=new String("hello Java");
		String s1=s.intern();
		System.out.println(s1);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));

	}

}
