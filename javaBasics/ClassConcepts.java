package javaBasics;

public class ClassConcepts {
	String a ;//global variable
	String b ;//global variable

	public static void main(String[] args) {
		ClassConcepts i = new ClassConcepts();// "new ClassConcepts" is the OBJECT
		ClassConcepts j = new ClassConcepts();//i,j,k are object reference variables
		ClassConcepts k = new ClassConcepts();
		i.a="ashok";
		i.b="mahesh";
		j.a ="suresh";
		j.b ="naresh";
		k.a ="ramesh";
		k.b="kamesh";
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(j.a);
		System.out.println(j.b);
		i=j;
		j=k;
		k=i;
		i.a="david";
		i.b="peter";
		
		j=k;
		System.out.println(i.a);
		System.out.println(i.b);
		System.out.println(j.a);
		System.out.println(j.b);
		
		

	}

}
