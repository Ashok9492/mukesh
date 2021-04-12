package javaBasics;

public class TableCreation {

	public static void main(String[] args) {		
		int a = 2;
		for(int i=1;i<=10;i++) {
			System.out.println(a+"x"+i+"="+a*i);
		}
		for(int i=1;i<=10;i++) {
			if(i==5)
				break;{
				System.out.println(i);
			}
		}
	}
}
