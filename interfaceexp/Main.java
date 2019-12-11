package interfaceexp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ClassInherit obj=new ClassInherit();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		obj.add(a, b);
		obj.sub(a, b);
		obj.mult(a, b);
		obj.div(a, b);
	}

}
