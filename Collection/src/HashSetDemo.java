import java.util.HashSet;
import java.util.Iterator;
public class HashSetDemo {
	
public static void main(String [] args) {
	HashSet<Integer> a1 = new HashSet<Integer>();
	a1.add(45);
	a1.add(405);
	a1.add(40);
	a1.add(80);
	
	Iterator<E> i1 = a1.iterator();
	while(i1.hasNext()) {
		System.out.println(i1.next());
	}
}
}
