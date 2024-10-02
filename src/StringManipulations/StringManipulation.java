package StringManipulations;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		String str="Hi This is my java code and I am so happy";
		System.out.println(str.length());
		System.out.println("Hi: "+0);
		System.out.println("Li: "+(str.length()-1));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(40));
		System.out.println(str.indexOf("h"));
		System.out.println(str.indexOf('i'));
		System.out.println(str.indexOf('i',str.indexOf('i')+1));
		
		String mesg="Welcome admin";
		if(mesg.indexOf("admin")==8) {
			System.out.println("Admin is present---Pass");
			}
		else
			System.out.println("Admin is not present--- Fail");

		
		String t1=" Hello Java ";
		System.out.println(t1.trim());
		//Lower case Upper case
		String t2="Hello Java World";
		System.out.println(t2.toUpperCase());
		System.out.println(t2.toLowerCase());
		//replace
		String dob="01-04-1980";
		System.out.println(dob.replace('-', '/'));
		System.out.println(t2.replace(" ", ""));
		
		//contains
		String t3="I love java coding";
		System.out.println(t3.contains("java"));
		//equals
		System.out.println(t1.equals(t3));
		String t4= "I love Java Coding ";
		if(t3.equalsIgnoreCase(t4.trim())) {
			System.out.println("test pass");
		}
		else
			System.out.println("Test Fail");
		//split
		
		String lang="Java_Python_Ruby_JavaScript";
		String lg[]=lang.split("_");
		System.out.println(lg[1]);
		System.out.println(lg.length);
		System.out.println(Arrays.toString(lg));
		
		String pop="xXTestXxXMyxXCodexXJavaxXProgxX";
		String pp[]=pop.split("xX");
		System.out.println(pp[0].length());//nothing (blank)
		System.out.println(pp[4]);
		//System.out.println(pp[5]);//AIOB
		System.out.println(Arrays.toString(pp));
		System.out.println("Naveen;Autoation;Labs".split(";")[1]);
		
		String otp= "Your otp number is 0992";
		
		String ot[]=otp.split("");
		System.out.println(ot[ot.length-1]);
		
		
		String s1="abc";
		String s2="def";
		String s3="abc";
		
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		System.out.println(s1+" "+s2+" "+s3);
		
		


	}

}
