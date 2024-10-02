package Demo1;


public class ArrayLiteralsPrograms {

	public static void main(String[] args) {
		//  reverse order array value using for each loop
		int num[]= {10,72,120,50,21};
		System.out.println(num.length);
		int count= num.length-1;
		 for(int e:num) {
		 e=count;
			 System.out.println(num[e]);
			 count--;
			
		 }
		 System.out.println("------------------");
		
		 for(int i=0;i<num.length;i++ ) {
			 System.out.println(num[i]);
		 }
		
		 System.out.println("reverse array printing---------------");
		 for(int k=num.length-1;k>=0;k--) {
					 
			 System.out.println(num[k]);
				 
		 }
		 
	}

}
