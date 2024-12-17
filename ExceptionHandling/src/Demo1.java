import java.util.*;
public class Demo1 {
public void show() {
	int a,b;
	System.out.println("Enter any two numbers");
    Scanner sc= new Scanner(System.in);
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Addtition" + (a+b));
	System.out.println("Division" + (a/b));
	System.out.println("Addtition" + (a*b));
	System.out.println("Addtition" + (a-b));
}
public static void main(String[] args) {
	Demo1 d1 = new Demo1();
	d1.show();
}
}
