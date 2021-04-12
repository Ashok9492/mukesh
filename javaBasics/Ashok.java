package javaBasics;

public class Ashok {

	public void Sum() {
		System.out.println("parent Sum method");
	}

	public class Mahesh extends Ashok {
		public void Sum() {
			System.out.println("child Sum method");

		}
	}

	public static void main(String[] args) {
		Ashok obj = new Ashok();
		obj.Sum();

	}

}
