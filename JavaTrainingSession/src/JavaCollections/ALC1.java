package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ALC1 {

	public static void main(String[] args) {
		Student s1=new Student("Koushik",16,12,"DPS");
		Student s2=new Student("Kousalya",14,10,"DPS");
		Student s3=new Student("Viswajith",12,8,"Royal Concorde");
		Student s4=new Student("Hruthvik",10,3,"St.Peter's");
		//adding student objects
		ArrayList<Student> as=new ArrayList<Student>();
		as.add(s1);
		as.add(s2);
		as.add(s3);
		as.add(s4);
		//retrieving the values
		Iterator<Student> it=as.iterator();
		while(it.hasNext()) {
			Student stu=it.next();
			System.out.println();
			System.out.println("Student Details");			
			System.out.println(stu.name);
			System.out.println(stu.age);
			System.out.println(stu.std);
			System.out.println(stu.scname);
		}
		
	}

}
