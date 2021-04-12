package javaBasics;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFind {

	public static void main(String[] args) {
		String names[] = { "ashok", "book", "cat", "cat", "dog" };
		Set<String> s = new HashSet<String>();
		for (String name : names) {
			
			if (s.add(name) == false) {
				System.out.println(name);

			}
		}
	}
}
