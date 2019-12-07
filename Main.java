package abstraction;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AbstractClass obj=new InheritClass();
				Scanner s=new Scanner(System.in);
				System.out.println("enter the values");
				int a=s.nextInt();
				int b=s.nextInt();
				obj.add(a,b);
				obj.subtract(a, b); 
				

	}

}
