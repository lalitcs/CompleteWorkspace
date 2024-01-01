import java.util.*;
public class CollectionAdd {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Rahul");
		al.add("Virat");
		al.add("MSD");
		al.add("Raina");
		al.add("Rohit");
		System.out.println(al);
		al.remove("Raina");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.contains("MSD"));
		System.out.println(al.isEmpty());
	}

}
