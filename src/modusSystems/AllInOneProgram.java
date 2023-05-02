package modusSystems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class AllInOneProgram {

	//public static void main(String[] args) {

	//		//JDBC CONNECTION
	//		String url="jdbc:/mysql:/localhost8080/mydatabase";
	//		String username="myusername";
	//		String password="mypassword";
	//		try {
	//			Connection c=DriverManager.getConnection(url,username,password);
	//
	//		} catch (Exception e) {
	//			System.out.println(e);
	//		}


	//ARRAYLIST
	//		ArrayList <String>al=new ArrayList();
	//		al.add("10");
	//		al.add("20");
	//		al.add("30");
	//		
	//		System.out.println("print By Using for loop--------");
	//		for(int i=0;i<al.size();i++) {
	//			System.out.println(al.get(i));
	//		}
	//		
	//		
	//		System.out.println("print by using Advance for Loop-----------");
	//		for(String obj:al) {
	//			System.out.println(obj);
	//		}
	//		System.out.println("print by using while Loop-----------");
	//		Iterator<String >itr=al.iterator();
	//		while(itr.hasNext()) {
	//			System.out.println(itr.next());
	//		}


	//HASHMAP
	//		HashMap<Integer, String>hm=new HashMap<Integer,String>();
	//		hm.put(5, "raghu");
	//		hm.put(6, "karnataka");
	//		hm.put(4, "ravi");
	//		hm.put(3, "bihar");
	//		
	//		Hashtable<Integer, String>ht=new Hashtable<>(hm);
	//	
	//		
	//		for(Map.Entry<Integer, String>entr:ht.entrySet()) {
	//			System.out.println("Name :"+entr.getKey()+" "+"Number:"+entr.getValue());
	//		}



	//ENCAPSULATION
	//	private String name;
	//	private int id;
	//	private int age;
	//
	//
	//	//getMethod
	//	public String getName() {
	//		return name;
	//	}
	//	public int getId() {
	//		return id;
	//	}
	//	public int getAge() {
	//		return age;
	//	}
	//
	//	//setMethod
	//	public void setName(String name) {
	//		this.name=name;
	//	}
	//	public void setId(int id) {
	//		this.id=id;
	//	}
	//	public void setAge(int age) {
	//		this.age=age;
	//	}
	//
	//
	//	public static void main(String[] args) {
	//
	//		AllInOneProgram al=new AllInOneProgram();
	//		al.setName("Lord HanumanJi");
	//		al.setId(11);
	//		al.setAge(27);
	//		
	//		
	//		System.out.println("Name :"+al.getName());
	//		System.out.println("Id :"+al.getId());
	//		System.out.println("Age:"+al.getAge());
	//		
	//	}



	//EXCEPTION HANDLING

	public static void main(String[] args) {

int age=15;
		try {
			if(age<18) {

			}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}


