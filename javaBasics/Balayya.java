package javaBasics;

public class Balayya extends NTR{

	@Override
	void Dance() {
		System.out.println("Balayya can Dance");
		
	}
	public static void main(String[] args) {
		Balayya obj = new Balayya();
		obj.Dance();
		obj.Fight();
	}

}
