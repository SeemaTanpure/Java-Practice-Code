package Demo1;

import java.util.Arrays;

public class StaticArrays {

	public static void main(String[] args) {
		
		int i[]=new int[4];
		i[0]=2;
		i[1]=5;
		i[2]=3;
		i[3]=7;
		
		//indexed based for loop
		for(int k=0; k<i.length-1;k++) {
			System.out.println(k);
		}
		System.out.println("----------------");
		//for each loop/object based
		
		for(int e:i) {
			System.out.println(e);
		}
		System.out.println("----------------");
		
		//double array
		double d[]= {21.15, 12.00, 25.41, 35.50};
		for(double e:d) {
			System.out.println(e);
		}
		//char array
		char ch[]= {'a','a', 'e','c','f'};
		for (char e:ch) {
//			System.out.println(e);
			System.out.println((byte)e);
		}
		System.out.println(Arrays.toString(ch));
		
		//String Array
		String emp[]= {"Tom","Lisa","Amit","Jane"};
		for(String e:emp) {
			System.out.println(e);
			if(e.equals("Amit")) {
				System.out.println("employee is an admin");
				break;
				}
			}
		System.out.println(Arrays.toString(emp));
		
		//Object array
		Object data[]= {"Tom", 23, 'm', 35.55, true};
		System.out.println(Arrays.toString(data));
		
		for(Object e:data) {
			System.out.println(e);
		}
		
		
		
	}

}
