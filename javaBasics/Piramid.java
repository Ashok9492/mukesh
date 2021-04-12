package javaBasics;

public class Piramid {

	public static void main(String[] args) {
		Piramid obj = new Piramid();
		obj.piramid();

	}

	public void Ashok() {
		System.out.println("i am Ashok");
		System.out.println("-------");
		piramid();

	}

	public void piramid() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	Piramid() {
		System.out.println("this is piramid");
		
	}
}
