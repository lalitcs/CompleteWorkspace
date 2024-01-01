import java.util.*;
public class TreeSetGenericDesSort {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(65);
		hs.add(165);
		hs.add(5);
		hs.add(34);
		hs.add(7);
		hs.add(2);
		TreeSet<Integer> t1=new TreeSet<Integer>(hs);
		System.out.println(t1);
		System.out.println(t1.descendingSet());
	}
}