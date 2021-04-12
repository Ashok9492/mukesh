package javaBasics;

public class LowestNumInarray {

	public static void main(String[] args) {
		int a[]= {2,4,1,8,6,10};
		int low =a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<low) {
				low = a[i];
				
			}
		}System.out.println(low);

	}

}
