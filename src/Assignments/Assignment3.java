package Assignments;

public class Assignment3 {

	public static void main(String[] args) {
		// Find Max from 3 numbers using if else stt
		int a=34;
		int b=26;
		int c=87;
			
		if(a>b && a>c) {		
		System.out.println("max Nummber: "+a);
		}
		else if(b>a && b>c){
			System.out.println("max Nummber: "+b);
		}
		else 
			System.out.println("max Nummber: "+c);
		System.out.println("------------------------------");
		int u=344;
		int v=232;
		int w= 432;
		int x=689;
		if(u>v && u>w && u>x) {		
			System.out.println("max Nummber: "+u);
			}
			else if(v>u && v>w && v>x){
				System.out.println("max Nummber: "+v);
			}
			else if(w>u && w>v && w>x){
				System.out.println("max Nummber: "+w);
			}
			else {
				System.out.println("max Nummber: "+x);
			}
		System.out.println("------------------------------");
		System.out.println("Using Swich case stt");
		
			
	}
}
