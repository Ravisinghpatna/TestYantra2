import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Key_Value_Count {

	public static void main(String[] args) {
		String st = "Roses are red!";

		String[] s = st.split(" ");
		LinkedHashMap<String, Integer> lh=new LinkedHashMap<>();
		for(int i=0;i<s.length;i++)
		{
			lh.put(s[i], s[i].length());
		}
		//System.out.println(lh);
		
		for(Entry<String, Integer> m:lh.entrySet())
		{
			System.out.println(m);
		}
		
	}

}
