import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
public static void main(String[] args) {
	LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>();
	s1.add(30);
	s1.add(20);
	s1.add(30);
	s1.add(40);
	s1.add(15);
	System.out.println(s1);
}
}
