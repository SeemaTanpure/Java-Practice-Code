package DynamicArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// List(I)-->ArrayList(C)
		List<String> browserList=new ArrayList<String>();
		browserList.add("chrome");
		browserList.add("edge");
		browserList.add("firefox");
		System.out.println(browserList);
		System.out.println(browserList.get(0));
		

	}

}
