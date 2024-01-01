
public class RemoveOtherString {

	public static void main(String[] args) {
		String s="this is lalit";
		
		System.out.println(s.replace("is","was"));
		
		System.out.println(s.replaceFirst("is","was"));
		
		System.out.println(s.replaceAll("is","was"));
		
		System.out.println(s.replaceAll("is(.)","was"));
		
		System.out.println(s.replaceFirst("is(.*)","was"));

	}

}
