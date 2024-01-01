
public class String_Split_fun {

	public static void main(String[] args) {
		String s="hello hi bye welcome";
		String[] arr=s.split("");
		for(String ele:arr) {
			System.out.print(ele);
			}
		System.out.println("==============");
		String s1="hello@hi@bye@welcome";
		String[] arr1=s1.split("@");
		for(String ele:arr1) {
			System.out.println(ele);
		}

	}

}
