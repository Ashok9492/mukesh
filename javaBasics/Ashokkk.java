package javaBasics;

public class Ashokkk extends Overriding {

	public void Ashok() {
		System.out.println("I am from child  class");
	}

	public static void main(String[] args) {
		Ashokkk a = new Ashokkk();
		Overriding b = new Overriding();
		a.Ashok();
		b.Ashok();

	}
}
