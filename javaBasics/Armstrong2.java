package javaBasics;

public class Armstrong2 {

	public static void main(String[] args) {
		int n = 153;
		int real = n;
		int temp;
		int sum = 0;
		while (n > 0) {
			temp = n % 10;
			sum = sum + (temp * temp * temp);
			n = n / 10;
		}
		System.out.println(sum);
		if (sum == real)

		{
			System.out.println("given num is armstrong");
		} else {
			System.out.println("given num is not armstrong");
		}

	}
}
