package javaBasics;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter thev value:");
		int n = scan.nextInt();
		//System.out.println(n);
		if(n%2==0) {
			System.out.println(+n+" is even number");
		}else {
			System.out.println(+n+" is odd number");
		}

		
	}

}
