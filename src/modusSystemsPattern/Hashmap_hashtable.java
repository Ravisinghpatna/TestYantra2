package modusSystemsPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Hashmap_hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(1, "dashrathi");
		hm.put(2, "ravi");
		hm.put(3, "raushan");
		hm.put(4, "dinesh");
		
		Hashtable<Integer, String> ht=new Hashtable<>(hm);
		for(Map.Entry<Integer,String>entry :ht.entrySet()) {
			System.out.println(entry.getKey()+"-------------"+entry.getValue() );
		}
	}

}
