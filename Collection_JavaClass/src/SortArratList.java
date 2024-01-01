import java.util.*;
public class SortArratList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(65);
		al.add(7);
		al.add(55);
		al.add(12);
		al.add(32);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		TreeSet t1=new TreeSet(al);
		System.out.println(t1);

	}

}
