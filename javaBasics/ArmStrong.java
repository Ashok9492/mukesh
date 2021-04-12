package javaBasics;

public class ArmStrong {

	public static void main(String[] args) {
		double i =100;
		double j = i%4;
		System.out.println(j); 
		ArmStrong ar = new ArmStrong();

	}

	ArmStrong() {
		int a = 1533;
		int real = a;
		int temp;
		int sum = 0;
		while (a > 0) {
			temp = a % 10;
			sum = sum + (temp * temp * temp);
			a = a / 10;

		}
		System.out.println(sum);
		if (real == sum) {
			System.out.println("given number is armstrong");
		} else {
			System.out.println("given number is not armstrong");
		}
	}
}
