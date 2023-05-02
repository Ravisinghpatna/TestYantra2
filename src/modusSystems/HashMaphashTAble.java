package modusSystems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class HashMaphashTAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm=new HashMap<>();
		hm.put('R', 18);
		hm.put('a', 1);
		hm.put('v', 22);
		hm.put('i', 9);

		Hashtable<Character, Integer> ht=new Hashtable<>(hm);
		ArrayList<Object> al=new ArrayList<>();
		al.add(ht);

			for(Object obj:al) {
			System.out.println(obj);
			
			
//			System.out.println('R'+'A'+'V'+'I');//ASCII Value 
//			System.out.println("r");
		}
	}
}
