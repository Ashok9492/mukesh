package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIst2 {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();

		ar.add(1);
		ar.add(34);
		ar.add(77);
		System.out.println(ar);
		Iterator<Integer> it = ar.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(2));

	}
}
