package testYantra;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx_1 {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("Ravi", 2);
		hm.put("Ankit", 4);
		hm.put("Amit", 6);
		hm.put("Raushan", 8);
		hm.put("Sumit", 10);

		        // Getting an Iterator for the HashMap
		        Iterator<Map.Entry<String, Integer>> it = hm.entrySet().iterator();
		        
		        // Looping through the HashMap using the Iterator
		        while(it.hasNext()) {
		            Map.Entry<String, Integer> entry = it.next();
		            String key = entry.getKey();
		            Integer value = entry.getValue();
		           // System.out.println("Key:-"+value);		            
		            System.out.println("Key: " + key + ", Value: " + value);
		        }
		    }
		

}
