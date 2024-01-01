
public class StringReplace {

	public static void main(String[] args) {
		String s="Hello Hi Bye abcd";
		String cur="abcd";
		String rep="Temp";
		String[] arr=s.split(" ");
		for(String ele:arr) {
			if(ele.equals(cur)) {
				System.out.println(rep+"");
			}
			else {
				System.out.println(ele+"");
			}
		}

	}

}
