package job;

import java.util.HashMap;

public class CountCharUsingMap {

	public static void main(String[] args) {
		String	s="Hi ! How are you Ravi singh";
		s=s.toLowerCase(); 

		HashMap<Character, Integer> hm=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			Character ch=s.charAt(i);
			if(hm.containsKey(ch)) {
				Integer num=hm.get(ch);
				hm.put(ch, ++num);
			}

			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
		}

}
