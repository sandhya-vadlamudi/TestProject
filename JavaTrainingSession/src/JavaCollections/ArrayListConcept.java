package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		//dynamic array -- array list:
		//1. can contain duplicate values
		//2. maintains insertion order
		//3. synchronized
		//4. allows random access
		ArrayList ar=new ArrayList(); // non generic
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println(ar.size());
		ar.add(40);
		ar.add(50);
		ar.add(50);
		ar.add(33.33);
		ar.add("test");
		ar.add('S');
		ar.add(true);
		System.out.println(ar.size()); //size of array list
		System.out.println(ar.get(3));  // 3rd element
		System.out.println("********");
		
		//to retrieve all the elements:
		//1.for loop
		//2. using iterator
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		// Non generic vs generic:
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(10);
		//ar1.add("Test"); -- gives error
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("Sandhya");
		//ar2.add(10); -- gives error
		
		System.out.println("***************");
		//storing Employee class objects in arraylist
		//user defined class object arraylist
		Employee e=new Employee("Sandhya",20,"QA");
		Employee e1=new Employee("Srinivas",27,"DEVE");
		Employee e2=new Employee("Kiran",23,"Deve");
		
		// store employee objects
		
		ArrayList<Employee> ar3=new ArrayList<Employee>();
		ar3.add(e);
		ar3.add(e1);
		ar3.add(e2);
		
		Iterator<Employee> it=ar3.iterator();
		
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("********MERGE TWO OBJECTS*******");
		//to merge two arraylist
		ArrayList<String> ar4=new ArrayList<String>();
		ar4.add("test");
		ar4.add("Selenium");
		ar4.add("QTP");
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("Developer");
		ar5.add("Java");
		ar5.add("Javascript");
		
		ar4.addAll(ar5); //adds ar5 to ar4
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i));
		}
		System.out.println("++++++++++++++++REMOVE ALL++++++");
		ar4.removeAll(ar5);
		for(int i=0;i<ar4.size();i++) {
			System.out.println(ar4.get(i));
		}
		System.out.println("**********RETAIN ALL*****************");
		//to retain all
				ArrayList<String> ar6=new ArrayList<String>();
				ar6.add("test");
				ar6.add("Selenium");
				ar6.add("QTP");
				ArrayList<String> ar7=new ArrayList<String>();
				ar7.add("test");
				ar7.add("Java");
				ar7.add("Javascript");
				
				ar6.retainAll(ar7); //retain all gives common values among the objects
				for(int i=0;i<ar6.size();i++) {
					System.out.println(ar6.get(i));
				}
	}

}
