import java.util.*;
public class LinkedListHashSet {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("Virat");
		li.add("MSD");
		li.add("Rohit");
		li.add("Rahul");
		li.add("Null");
		HashSet h1=new HashSet();
		h1.add("Virat");
		h1.add("MSD");
		h1.add("virat");
		h1.add("Null");
		h1.add("Rohit");
		h1.add("Rahul");
		h1.add("Null");
		System.out.println(li);
		System.out.println(h1);

	}

}
