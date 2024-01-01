package Map;
import java.util.*;
public class OccuranceOfEachCharUSingLinkedHashMap {
	public static void main(String[] args) {
		String s="ACBBADCCC";
	LinkedHashMap<Character,Integer> l1=new LinkedHashMap<Character,Integer>();
	for(int i=0;i<s.length();i++) {
		if(l1.containsKey(s.charAt(i))) {
			l1.put(s.charAt(i),l1.get(s.charAt(i))+1);
		}
		else {
			l1.put(s.charAt(i),1);
		}
	}
	for( Entry<Character,Integer> ele:l1.entrySet()) {
		System.out.println(ele.getKey()+""+ele.getValue());
	}

	}
}



