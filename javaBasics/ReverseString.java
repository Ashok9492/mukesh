package javaBasics;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Ashok");
		//System.out.println(sb.reverse());
		//StringBuffer sb1 = new StringBuffer("Ashok");
		//System.out.println(sb1.append("java"));
		//System.out.println(sb1.insert(1, "java"));
		System.out.println(sb.delete(1,3));
		
		StringBuffer su = new StringBuffer("Mahesh");
		System.out.println(su.reverse());
	}

}
