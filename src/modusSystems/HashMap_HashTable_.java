package modusSystems;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class HashMap_HashTable_ {


	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("ravi", 21);
		hm.put("dinesh", 02);
		hm.put("dashrathi",7);
		hm.put("abhijeet", 3);
		hm.put("raushan", 0);

		Hashtable<String, Integer> ht=new Hashtable<>(hm);
		System.out.println(ht);

//		for(Map.Entry<String, Integer> entry:ht.entrySet()) {
//			System.out.println(entry.getKey()+"  "+entry.getValue());
			
			System.out.println("-----by using while loop---------");
			Iterator<Map.Entry<String, Integer>> it = ht.entrySet().iterator();

	        // Iterate over the key-value pairs and print them out
	        while (it.hasNext()) {
	            Map.Entry<String, Integer> entry = it.next();
	            System.out.println(entry.getKey() + " " + entry.getValue());;

			//		Set<Object> s=(Set)ht.entrySet();
			//		Iterator it=s.iterator();
			//		
			//		while(it.hasNext()) {
			//			System.out.println(it.next());
			//		}

		}
	}
}
