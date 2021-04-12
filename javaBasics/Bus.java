package javaBasics;

public class Bus {
	 int a=100;
	 int b=300;
	
	Bus(){
		int a=10;
		int b=20;
		int c= a+b;
		System.out.println(c);
	}
	Bus(int a,int b){
		 
		 System.out.println(a+b);
	}
	
	public static void main(String[] args) {

		Bus b = new Bus();
		Bus b1 = new Bus(20,40);
	
	
	}

}
