package modusSystems;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Print_ForLoop_While_Loop_For_Each_Loop___ {

	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList();
		al.add("10");
		al.add("20");
		al.add("30");


		System.out.println(al);
		System.out.println("----using for loop-----");

		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

		System.out.println("-by using for each loop-------");
		for(Object o:al) {
			System.out.println(o);
		}

		System.out.println("-by using while loop---------------");

		Iterator<Object> it=al.iterator();	
		while(it.hasNext())
		{

			System.out.println(it.next());
		}

	}

}
