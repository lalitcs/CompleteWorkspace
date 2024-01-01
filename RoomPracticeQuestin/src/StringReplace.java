
public class StringReplace {

	public static void main(String[] args) {
		String s="I AM LALIT KUMAR";
		String cur="LALIT";
		String rep="SHASHI";
		String[] arr=s.split(" ");
		for(String ele:arr) {
			if(ele.equals(cur)) {
				System.out.print(rep+" ");
			}
			else {
				System.out.print(ele+" ");
			}
		}

	}

}
