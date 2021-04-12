package javaBasics;

//import java.util.Scanner;

public class ArrayCount {

	public static void main(String[] args) {
		int a[] = { -1, 2, 3, -2, 4, 7 };
		// Scanner scan = new Scanner(System.in);
		// int n = scan.nextInt();
		int pc = 0;
		int nc = 0;
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] >= 0) {
				pc++;
			} else {
				nc++;
			}
		}
		System.out.println("possitive number count is: " + pc);
		System.out.println("Negative number count is: " + nc);
		int b[] = { 1, 3, 4, 4,3, 0 };
		int find =4;
		for (int j = 0; j < b.length; j++) {
			if (b[j] ==find) {
				System.out.println("position of num:"+j);
			}
		}

	}

}
