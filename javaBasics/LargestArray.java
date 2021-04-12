package javaBasics;

public class LargestArray {

	public static void main(String[] args) {
		int n[]= {1,3,5,8,9};
		//System.out.println(n[1]);
		int large=0;
		int Secondlarge=0;
		for(int i=0;i<n.length;i++) {
			if(n[i]>large) {
				Secondlarge= large;
				large=n[i];
			}else if(n[i]>Secondlarge) {
				Secondlarge=n[i];
				
			}
		}System.out.println(large);
		System.out.println(Secondlarge);

	}

}
