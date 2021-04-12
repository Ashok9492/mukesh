package javaBasics;

public class CallByValue {

	public static void main(String[] args) {
		CallByValue obj = new CallByValue();
		int x=10;
		int y=20;
		System.out.println(obj.sum(x, y));//call by value or pass by value
		
		
		
		

	}
	public  int sum(int a,int b) {
		 a=30;
		 b=20;
		int c=a+b;
		return c;
	}

}
