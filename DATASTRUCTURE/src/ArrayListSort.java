import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		int[] arr= {6,2,3,1};
		ArrayList<Integer> l1=new ArrayList<Integer>();
		for(int ele:arr) {
			l1.add(ele);
		}
		Collections.sort(l1);
		System.out.println(l1);

	}

}
