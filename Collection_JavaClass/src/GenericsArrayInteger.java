import java.util.*;
public class GenericsArrayInteger {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("JAVA");
		al.add('x');
		al.add(55);
		al.add(6.5);
		al.add(true);
		System.out.println(al);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("JAVA");
		a2.add(55);

	}

}
