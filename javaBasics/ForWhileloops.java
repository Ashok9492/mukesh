package javaBasics;

public class ForWhileloops {

	public static void main(String[] args) { 
		int i=1;
		while(i<5) {
			//while loop disadvantage is it will generate infinite loop if you don't give incremental
			System.out.println("i values are i:" +i); 
			i++; 
		}
		
		int a;
		for(a=1;a<5;a++) { 
			System.out.println("a values are a:" +a);
		}
			// a++ mean a=a+1
		
		for(int b=5;b>-5;b--) {
		System.out.println("b values are b:" +b);
		}
		
	
 
	}

}
