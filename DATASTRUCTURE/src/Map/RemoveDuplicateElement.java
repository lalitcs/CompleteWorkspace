package Map;
import java.util.*;
public class RemoveDuplicateElement {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> l1=new LinkedHashMap<Integer,Integer>();
		int[] arr= {12,34,66,77,12,90,66,9,23};
		for(int ele:arr) {
			if(l1.containsKey(ele)) {
				l1.put(ele,l1.get(ele)+1);
			}
			else {
				l1.put(ele,1);
			}
		}
		Set s1=l1.keySet();
		for(Object ele:s1) {
			if(l1.get(ele)>1) {
				System.out.println(ele);
			}
		}

	}

}
