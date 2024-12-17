import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
public static void main(String[] args) {
	HashMap<Integer, String>h1 = new HashMap<Integer, String>();
	h1.put(12,"megah");
	h1.put(14, "neha");
	h1.put(16, "uma");
	h1.put(14, "Asha");
	//System.out.println(h1);
	Set s1 = h1.entrySet();
	Iterator i1 = s1.iterator();
	while(i1.hasNext()) {
		Map.Entry m1 =(Map.Entry)i1.next();
		System.out.println("Roll Number:" + m1.getKey()  +  "Name:" + m1.getValue() );
	}
	Map h2 = Collection
}
}
