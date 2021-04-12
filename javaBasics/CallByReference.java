package javaBasics;

public class CallByReference {
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByReference obj = new CallByReference();
		//obj.sum();
		obj.p=20;
		obj.q=30;
		obj.swap(obj);
		System.out.println(obj.p);
		
		

	}
	public void swap(CallByReference d) {
		int p=10;
		int q=20;
		//int c = a+b;
		//System.out.println(c);
	}

}
