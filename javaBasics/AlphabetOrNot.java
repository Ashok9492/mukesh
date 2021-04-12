package javaBasics;

public class AlphabetOrNot {

	public static void main(String[] args) {
		char ch = '@';
		if((ch>='a' && ch<='z' ) ||(ch>='A'&&ch<='Z')){
			System.out.println(ch+ " is a alaphabet");
			
		}else {
			System.out.println(ch+ " is not alphabet");
		}
	}

}
