package javaBasics;

public class StringConcept { 
	 final int a=10;

	public static void main(String[] args) {
		String s = "Ashok";
		System.out.println(s);
		//s = "Avinash";
		//System.out.println(s);
		//System.out.println(a);
		StringConcept obj = new StringConcept();
		obj.Ashok();
		//StringConcept.Avinash();
		
		

	}
	void Ashok() {
		System.out.println("Ashok value is " +a);
	}
	//static void Avinash() {
		//System.out.println("Avinash vslue is " +a);
	//}

}
