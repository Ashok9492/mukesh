package javaBasics;

public class Fibonacci {

	public static void main(String[] args) {
		int num = 10;
		int t1 = 0;
		int t2 = 1;
		for (int i = 1; i < num; i++) {
			System.out.print(t1 + ",");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}

		int a = 81;
		int b = 153;
		int gcd = 1;
		{
			for (int i = 1; i <= a && i <= b; ++i) {
				if (a % i == 0 && b % i == 0) {
					gcd = i;
					System.out.println(+gcd);
				}

			}
		}
	}
}