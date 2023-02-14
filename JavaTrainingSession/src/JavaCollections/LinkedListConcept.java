package JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("RPA");
		ll.add("RFT");

		// Contents of Linked List
		System.out.println("Contents of Linked List:" + ll);
		// add First:
		ll.addFirst("Sandhya");
		// add Last:
		ll.addLast("Srinivas");
		System.out.println("Contents of Linked List:" + ll);

		// get
		System.out.println(ll.get(0));
		// set
		ll.set(0, "Sairam");
		System.out.println(ll.get(0));

		// remove first and last:
		ll.removeLast();
		ll.removeFirst();
		System.out.println("Contents of Linked List:" + ll);
		ll.remove(4);
		System.out.println("Contents of Linked List:" + ll);

		// how to print/iterate all the values of linked list:
		// 1. for loop
		System.out.println("*******Using For ");
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}
		// 2. advanced for loop or for e
		System.out.println("*******Using Advanced For ");
		for (String str : ll) {
			System.out.println(str);
		}
		// 3. iterator
		System.out.println("*******Using iterator ");
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// 4. while loop
		System.out.println("*******Using while ");
		int num=0;
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}
