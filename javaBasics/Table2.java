package javaBasics;

import java.util.Scanner;

public class Table2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter the value: ");
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+a*i);
			
		}
		}
		
	}


