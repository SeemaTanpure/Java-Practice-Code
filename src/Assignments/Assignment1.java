package Assignments;

import java.util.Arrays;

public class Assignment1 {
	public static Object[] reverseArray(Object[] array) {
		int length= array.length;
		Object[] reversedArray=new Object[length];
		int count=0;
		for(int i=length-1;i>=0;i--) {
			reversedArray[count]=array[i];
			count++;
		}
		return reversedArray;
	}

	public static void main(String[] args) {
		
		// using for loop
		int p[] = {1,3,4,5,22,56,89,90};
		for (int i=p.length-1; i>=0;i--) {
			System.out.print(p[i]+ " ");
		}
		System.out.println();
		//	using for while loop
		int j=p.length-1;
		while(j>=0) {
			System.out.print(p[j]+ " ");
			j--;
		}
		System.out.println();
		//using do while loop
		int k=p.length-1;
		do {
			System.out.print(p[k]+ " ");
			k--;
			}
		while(k>=0);
		System.out.println();
		
		Object[] OriginalArray = {51,19,12,34,82};
		Object[] reversedArray=reverseArray(OriginalArray);
		System.out.println(Arrays.toString(reversedArray));
	
	}

}
