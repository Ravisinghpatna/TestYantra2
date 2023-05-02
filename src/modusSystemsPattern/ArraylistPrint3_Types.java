package modusSystemsPattern;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistPrint3_Types {
public static void main(String[] args) {
	ArrayList<String>al=new ArrayList<>();
	al.add("Ravi");
	al.add("Sumit");
	al.add("Amit");
	al.add("Dinesh");
	
	System.out.println(al);
	System.out.println("--------using for loop-------");
	for(int i=0;i<al.size();i++) {
		System.out.println(al.get(i));
	}
	System.out.println("--------using Advancefor loop-------");
	for(String obj:al) {
		System.out.println(obj);
	}
	System.out.println("--------using While loop (Iterator)-------");
	Iterator <String>it=al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
}
}
