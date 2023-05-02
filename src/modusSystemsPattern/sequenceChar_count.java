package modusSystemsPattern;

import java.util.HashMap;

public class sequenceChar_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "ravisinghpatna";
		HashMap<Character, Integer>hm=new HashMap<>();

		for(int i=0;i<string.length();i++) {
			
			Character ch=string.charAt(i);
			if(hm.containsKey(ch)) {
				Integer num=hm.get(ch);
				hm.put(ch, ++num);
			}
			else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

	}

}
