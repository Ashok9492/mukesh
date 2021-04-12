package javaBasics;

public class FindLetterinString {

	public static void main(String[] args) {
		String a = "Ashok is a good boy";
		System.out.println(a.length());
		System.out.println(a.contains("As"));
		System.out.println(a.indexOf("y"));
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'o') {
				System.out.println("found at "+i+" position");
			}

		}
	}

}
