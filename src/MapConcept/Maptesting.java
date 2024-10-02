package MapConcept;

import java.util.HashMap;

public class Maptesting {

	public static void main(String[] args) {
		// collection: <key,value> pair
		//Hashmap(c)-->Map(I)
		//It is non oder based collection
		//one null value allowed
		
		HashMap<String,Integer> map=new HashMap<String, Integer>();
		map.put("Chrome", 101);
		map.put("edge", 111);
		map.put("Firefox", 96);
		
		HashMap<Integer, Integer> map1=new HashMap<Integer, Integer>();
		map1.put(100, 1);
		
		HashMap<String, Object> map2=new HashMap<String, Object>();
		map2.put("name", "veena");
		map2.put("age", 32);
		map2.put("Designation", "SDET");
		map2.put("IsPerm", true);
		map2.put("gender",'f');
		map2.put("phone", null);
		map2.put(null, "India");
		map2.put(null, null);
		
		System.out.println(map2.get("name"));
		System.out.println(map2.get("age"));
		System.out.println(map2.get("Designation"));
		
		System.out.println(map2.get(null));
		System.out.println("---------");
		System.out.println(map2);
		System.out.println("---------");
		
		HashMap<String, Integer> empMap=new HashMap<String, Integer>();
		empMap.put("Tom", 20);
		empMap.put("Veena", 30);
		empMap.put("sunil", 32);
		
		System.out.println(empMap);
		
		
		
		
		
		
		
		

	}

}
