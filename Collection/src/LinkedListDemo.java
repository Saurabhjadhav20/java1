import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<Integer> l1  = new LinkedList<Integer>();
		l1.addFirst(23);
		l1.add(12);
		l1.addLast(27);
		l1.addFirst(16);
		l1.add(67);
		System.out.println(l1);
	}
}
