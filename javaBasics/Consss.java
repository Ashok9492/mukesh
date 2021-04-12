package javaBasics;

public class Consss {
	  int a=10;
	
	Consss(){
		System.out.println("concstructor");
	}
	public  static int sum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	public static void main(String[] args) {
		Consss c = new Consss();
		sum(10, 200);
		Consss.sum(23, 670);
	}
	
		
		
		
	
	
}
