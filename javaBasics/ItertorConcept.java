package javaBasics;

import java.util.Iterator;
import java.util.LinkedList;

public class ItertorConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Ashok");
		ll.add("Naveen");
		ll.add("Mukesh");
		ll.add("A b devilliers");
		System.out.println(ll);
		Iterator<String> it =ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ll.add(1, "kohli");
		System.out.println(ll);
		ll.remove("Naveen");
		System.out.println(ll);
		ll.addFirst("Sachin");
		Iterator<String> it2 =ll.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		Iterator<String> it3=ll.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}

	}
	

}
