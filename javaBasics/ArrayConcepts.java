package javaBasics;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayConcepts {

	public static void main(String[] args) {
		//it strores duplicate values
		//it mainatains insertion order
		//allows random access to fetch elements because it stores values on the basis of index
		ArrayList ar3 = new ArrayList();
		ar3.add("Ashok");
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(10);
		ar.add(20);
		ar.add(30);
		System.out.println("array length is " +ar.size());
		System.out.println(ar.get(0));
		System.out.println(ar);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("*************");
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Ashok");
		ar1.add("naresh");
		System.out.println(ar);
		for(int i = 0; i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		ar1.add(2, "Mahesh");
		for(int i = 0; i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		Emp E = new Emp();
		Emp E1 = new Emp();
		Emp E2 = new Emp();
		ArrayList<Emp> al = new ArrayList<Emp>();
		al.add(E);
		al.add(E1);
		al.add(E2);
		System.out.println(al.get(0));
		
		
		//Iterator ir = new Iterator();
	}

}
