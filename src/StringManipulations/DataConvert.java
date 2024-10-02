package StringManipulations;

import java.util.Arrays;

public class DataConvert {

	public static void main(String[] args) {
		String s= "100";
		System.out.println(s+20);//10020
		
		int i=Integer.parseInt(s);
		System.out.println(i+20);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		String y="100A";
		
		//String to Double
		String s1 ="1003.23";
		double d=Double.parseDouble(s1);
		System.out.println(d);
		//Int to string

		int t= 100;
		System.out.println(t+10);
		String e=String.valueOf(t);
		System.out.println(e+12);
		
		//double to string
		double marks=200.25;
		String m1=String.valueOf(marks);
		System.out.println(m1+23);
		
		//ch to string
		char ch='a';
		String cs=String.valueOf(ch);
		System.out.println(cs+23);
		
		//boolean to string

		boolean tr= true;
		String yr=String.valueOf(tr);
		System.out.println(yr+24);
		
		char cd[]= {'a', 'e', 'o','u'};
		String sd=String.valueOf(cd);
		System.out.println(sd);
		
//		String ar[]= {"Java", "Python","Ruby"};
//		System.out.println(String.valueOf(ar));
		
		//Primitive compare: ==
		//Non-primitive compae: .equals
		
		String rest="I love \"Java\" code";
		System.out.println(rest);
		
		String data="Seema.More.233433.Pune.India";
		String info[]=data.split("\\.");
		System.out.println(info);//some random value so need to convert to string
		System.out.println(Arrays.toString(info));
		//Wrapper class
		Integer u=100;
		System.out.println(u.SIZE);//4bytes 32 bites
		
		int l=042;//Octal number starts from 0
		System.out.println(l);	
		System.out.println(u.toString());
		System.out.println(u.toString().length());//length of string 
		
		
		
		
		

	}

}
