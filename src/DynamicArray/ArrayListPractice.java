package DynamicArray;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		//raw type array list
		ArrayList<Integer> arList=new ArrayList<Integer>(10);
		arList.add(120);
		arList.add(234);
		arList.add(300);
		for(Object e:arList) {  //for raw ArralyList we can use Object in for each loop
			System.out.println(e);
		}
		System.out.println("----------------------------");	
		
		//Generic type ArrayList
		ArrayList<String> browser =new ArrayList<String>();
		browser.add("chrome");
		browser.add("firefox");
		browser.add("edge");
		browser.add("ie");
		for(String e: browser) {
			System.out.println(e);
		}
		
		System.out.println("----------------------------");
		
		ArrayList<Object> EmpData=new ArrayList<Object>();
		EmpData.add("Tom");
		EmpData.add(12.33);
		EmpData.add(39);
		EmpData.add('m');
		EmpData.add(true);
		
		for(Object e: EmpData) {
			System.out.println(e);
			
		}
		
		

	}

}
