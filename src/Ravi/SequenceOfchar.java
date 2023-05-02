package Ravi;

import java.util.HashMap;

public class SequenceOfchar {

	public static void main(String[] args) {
		String st="hii, how are you?";
		char[] ch=st.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap();
		
		for(char c:ch) {
			if(hm.containsKey(c))
			{
				Integer count = hm.get(c);
				hm.put(c, ++count);
			}
			else
			{
				hm.put(c, 1);
			}
			
		}
		System.out.println(hm);
		
		
	}
}
