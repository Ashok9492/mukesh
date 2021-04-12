package javaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		fact();
		/*Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + n + " is :" + fact);*/

	}

	public static void fact() {

		int n = 5;
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}System.out.println(fact);

	}
}