package Assignments;

//import java.util.Arrays;

public class Assignment2 {

	public static double squareMethod(double num) {
		System.out.println("Square of Num:"+num);
		return num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object data[]=new Object[5];
		data[0] = "Sachin";
		data[1] = 30;
		data[2] = "male";
		data[3] = "01/12/1999";
		data[4] = 85.50;
	
		for(Object e:data) {
			System.out.println(e);
			}
			
		System.out.println("-----------------------------");
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}
		System.out.println("-----------------------------");
		
		double test= squareMethod(22.1);
		System.out.println(test);
		
		System.out.println("-----------------------------");
		double num=3.2;
		System.out.println("Square of Num: "+Math.pow(num, 2));
		
		

	}

}
