package DynamicArray;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());
		ar.add(100);
	
		ar.add(120);
		System.out.println(ar);
		ar.addAll(1, ar);
		System.out.println(ar);
		
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
	}

}
