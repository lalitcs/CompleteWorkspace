import java.util.*;
public class ForwardAndBackwardArrayList {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Lalit");
		al.add("Ajit");
		al.add("Ashwini");
		al.add("Itoki");
		al.add("Ashu");
		System.out.println("Forward Direction");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println();
		System.out.println("Backward Direction");
		for(int j=al.size()-1;j>=0;j--) {
			System.out.println(j);
		}
		System.out.println();

	}

}
