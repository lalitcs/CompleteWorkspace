import java.util.*;

public class HashSetLinkedHashSet {

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		h1.add("Virat");
		h1.add("MSD");
		h1.add("virat");
		h1.add("Rohit");
		h1.add("Rahul");
		h1.add("Null");
		LinkedHashSet li=new LinkedHashSet();  
		li.add("Virat");
		li.add("MSD");
		li.add("virat");
		li.add("Rohit");
		li.add("Rahul");
		li.add("Null");
		
		System.out.println(h1);
		System.out.println(li);
	}

}
