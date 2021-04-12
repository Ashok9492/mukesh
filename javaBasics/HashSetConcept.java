package javaBasics;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcept {

	public static void Duplicate() {
		int i;
		String names[] = { "Ashok", "Ashok", "mahesh", "naveen", "mukesh", "A b devilliers" };
		for(String name:names) {
			System.out.println(name);
		}
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if(store.add(name) == false) {
				System.out.println(name);
			}
		}

	}

	public static void main(String[] args) {
		Duplicate();

		Set<Object> hs = new HashSet<Object>();
		hs.add(1);
		hs.add("Sachin");
		hs.add(12.33);
		hs.add("kohli");
		hs.add("kohli");
		hs.add(-32);
		hs.add(null);
		System.out.println(hs);
		Iterator<Object> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		while (hs.equals(1)) {
			System.out.println();
		}

	}

}
