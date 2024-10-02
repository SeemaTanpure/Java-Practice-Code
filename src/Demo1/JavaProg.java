package Demo1;

public class JavaProg {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		System.out.println("--------------------------------");
		int i=1;
		while(i<=100) {
			if(i%5==0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("--------------------------------");
		i=0;
		while(i<=100) {
			System.out.println(i);
			i=i+5;
		}
		
		//print even and odd numbers from 1-100
		System.out.println("Even Numbers from 1-100");
		int j=1;
		while(j<=100) {
			if(j%2==0) {
				System.out.println(j);
			}
			j++;
		}
		
		j=0;
		System.out.println("Odd Numbers from 1-100");
		while(j<=100) {
			if(j%2!=0) {
				System.out.print(j+" ");
			}
			j++;
		}
		
		
		
		

	}

}
