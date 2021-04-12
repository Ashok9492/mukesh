package javaBasics;

public class WrapperClass {

	public static void main(String[] args) {  
		System.out.println("int to string");
		int i=1;
		String s = String.valueOf(i);
		System.out.println(s+10);
		System.out.println("String to int");
	String u ="10";
	int j= Integer.parseInt(u);
	System.out.println(j+10);
}}