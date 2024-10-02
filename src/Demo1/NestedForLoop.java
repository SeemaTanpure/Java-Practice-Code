package Demo1;

import java.util.Arrays;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print(i+""+j+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//Remove the element 6 from Array & print array
		int p[]= {1,4,9,3,22,6};
		int a[]= new int [p.length-1];
		int j=0;
		for(int k=0;k<p.length;k++) {
			if(p[k]!=6) {
				a[j]=p[k];
				j++;
			}
		}
	System.out.println(Arrays.toString(a));	
	System.out.println("-------------------------");	
	int s[] = {1,3,4,5,22,56,89,90};
	for(int d=0;d<s.length;d++) {
	
	}
	System.out.println();
	
	System.out.println(Arrays.toString(s));
	}
	

}
