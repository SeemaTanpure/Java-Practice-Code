package Demo1;

import java.util.Arrays;

public class LoopsPrograms {

	public static void main(String[] args) {
		// while loop
		byte i=1;
		while(i<=10) {
			System.out.println(i);
//			++i;
			i=(byte)(i+2);
		}
		System.out.println("-------------------");
		int k[]=new int[4];
		k[0]=10;
		k[1]=20;
		k[2]=30;
		k[3]=40;
		
		int len=k.length;
		System.out.println(len);
		
		for(int j=0; j<=k.length-1;j++) {//print array value
		System.out.println(k[j]);
		}
		System.out.println(Arrays.toString(k));
		
		System.out.println("-------------------");	
		
		for(int e: k) {
			System.out.println(e);
		}
		System.out.println("-------------------");	
		String browser[]= {"chrome","edge","firefox"};
		System.out.println(browser.length);
		for(String d:browser) {
			System.out.println(d);
			
		}
		System.out.println("-------------------");	
		String text1="Im a Batman";
		for(int l=1;l<=5;l++) {
			System.out.println(text1);
		}
		
		System.out.println("-------------------");	
		int m=0;
		while(m<10) {
			System.out.println(text1);
			m++;
				
		}
		
			
		}
		

}
