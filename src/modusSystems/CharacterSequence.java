package modusSystems;

import java.util.HashMap;

public class CharacterSequence {

	public static void main(String[] args) {

		String s1="Ravisingh@27.gmail.com";
		
		HashMap<Character, Integer>hm=new HashMap<>();
		for(int i=0;i<s1.length();i++) {
			Character ch = s1.charAt(i);
			if(hm.containsKey(ch)) {

				Integer n=hm.get(ch);
				hm.put(ch, ++n);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		
	
	}

}
