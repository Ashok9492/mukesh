package javaBasics;

import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for(int i =a;i<=15;i++) {
			System.out.println(i);
		}
	}

}
