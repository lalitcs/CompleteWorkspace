import java.util.*;
public class SortArrayHashSetOrTreeSet {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(65);
		hs.add(165);
		hs.add(5);
		hs.add(34);
		hs.add(7);
		hs.add(2);
		ArrayList<Integer> al=new ArrayList<Integer>(hs);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);

	}

}
