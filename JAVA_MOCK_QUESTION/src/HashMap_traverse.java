import java.util.*;
public class HashMap_traverse {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(7,"MSD");
		hm.put(18,"VIRAT");
		hm.put(10,"SACHIN");
		hm.put(45,"ROHIT");
		hm.put(33,"WATSON");
		System.out.println(hm);
		 for (String value : hm.values()) {
	            System.out.println("Value: " + value);
		}
	}

}
