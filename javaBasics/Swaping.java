package javaBasics;

public class Swaping {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swapping");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		/*a = a+b;//30
		b = a-b;//-10
		a = a-b;//-10
		System.out.println("After swapping");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);*/
		int temp;
		temp = a;
		a=b;
		b=temp;
		System.out.println("After swapping with third variable");
		System.out.println("a value is: "+a);
		System.out.println("b value is: "+b);
		
		
		
	}

}
