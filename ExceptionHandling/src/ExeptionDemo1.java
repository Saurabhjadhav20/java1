

import java.util.Scanner;
public class ExeptionDemo1 {
public void show() {
	int a,b;
	System.out.println("Enter any two numbers");
    Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Addtition" + (a+b));
	try {
	System.out.println("Division" + (a/b));
	}catch(ArithmeticException e){
		System.out.println("trying to divide by zero");
		
	}
	System.out.println("Addtition" + (a*b));
	System.out.println("Addtition" + (a-b));
}
public static void main(String[] args) {
	ExeptionDemo1 d1 = new ExeptionDemo1();
	d1.show();
}
}
