package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepteeee {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(3);
		ar.add(6);
		ar.add(6);
		ar.add(9);
		ar.add(-1);
		ar.add(10);
		ar.add(null);
		System.out.println(ar);
		Iterator<Object> it =ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		ar.remove(3);
		System.out.println(ar);
		System.out.println(ar.indexOf(10));
		

	}

}
