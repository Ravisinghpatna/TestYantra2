package modusSystems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
public class Duplicare_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name[]= {"Ravi","Dinesh","Dashrathi","Amit","Dinesh","Dinesh"};
	
		
		//Set<String>hs=new HashSet<>(Arrays.asList(name));
		HashSet<String> hs=new HashSet<>(Arrays.asList(name));
		//TreeSet<String> hs=new TreeSet<>(Arrays.asList(name));
		
		for(String obj:hs) {
			System.out.println(obj);
		}

	}

}
