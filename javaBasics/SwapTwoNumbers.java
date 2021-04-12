package javaBasics;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("Before swapping");
		System.out.println("a value is:" +a);
		System.out.println("b value is:"+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("a value is:" +a);
		System.out.println("b value is:"+b);
		

	}

}
