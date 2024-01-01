package Map;
import java.util.*;
 class LinkedHASHMAP {
	 public static void main(String[] args) {
		 LinkedHashMap<Integer,String> l1=new LinkedHashMap<Integer,String>();
		 l1.put(1,"apple");
		 l1.put(2,"ball");
		 l1.put(3,"cat");
		 l1.put(1,"airoplane");
		 System.out.println(l1);
		 
		 Set<Integer> k=l1.keySet();
		 System.out.println(k);
		 Collection<String> v=l1.values();
		 System.out.println(v);
		 
		 Set e=l1.entrySet();
		 System.out.println(e);
			

		
	}
	

}
