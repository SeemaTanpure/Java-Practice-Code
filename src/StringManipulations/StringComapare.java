package StringManipulations;

public class StringComapare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello selenium";
		String s2=new String("hello selenium");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3="hello selenium";
	
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		
		String t1=new String("cypress");//2 objects heap+SCP
		
		

	}

}
