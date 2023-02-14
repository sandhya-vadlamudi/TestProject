package JavaCollections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put("A", "test");
		h.put("B","Hello");
		h.put("C", "World");
		System.out.println(h.size());
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		
		//get
		System.out.println(h.get(1));// 100
		System.out.println(h.get("C")); // world
		
		h.put(3,"Tom"); //key can not be repeated value can be repeated
		
		//generic hash table
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(1, 1000); // both key, value are integers 
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(1, "Sandhya");
		
		}

}
