package javaBasics;

public class Armstrong3 {

	public static void main(String[] args) {
		int a = 153;
		int real= a;
		int sum = 0;
		int temp;
		while (a > 0) {
			temp = a % 10;
			sum = sum + (temp * temp * temp);
			a = a / 10;
		}
		System.out.println(sum);
		if (real == sum) {
			System.out.println("is arm strong number");
		}else {
			System.out.println("is not arm Strong number");
		}
	}

}
