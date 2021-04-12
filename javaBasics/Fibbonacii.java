package javaBasics;

public class Fibbonacii {

	public static void main(String[] args) {
		//1st intialize t1=0,t2=1;
		//then use for loop 
		//then use System.out.println(t1+"")
		//then int sum = t1+t2;
		//t1=t2;
		//t2=sum;
		int n = 10;
		int t1=0;
		int t2=1;
		for(int i=0;i<n;i++) {
			System.out.print(t1+" ");
			int sum = t1+t2;
			t1=t2;
			t2=sum;
			
			
		}
	}

}
