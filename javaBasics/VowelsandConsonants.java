package javaBasics;

public class VowelsandConsonants {

	public static void main(String[] args) {
		kangaroo();
		char ch = 'j';
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");

		} else {
			System.out.println(ch + " is consonant");
		}

	}
	

	public static void kangaroo() {

		String s = "Kangaroo";
		String s1= "Kangaroo";
		String s3="Ashok";
		if (s==s1 || s==s3) {
			System.out.println("they both jump");
			

		}

	}
}
