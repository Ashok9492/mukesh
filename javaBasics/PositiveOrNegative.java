package javaBasics;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("enter the value:");
		if(n>0.0){
			System.out.println(+n+ " is positive number");
			
		}else {
			System.out.println(+n+" is negative number");
		}
	}

}
