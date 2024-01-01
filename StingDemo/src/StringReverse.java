
public class StringReverse {

	public static void main(String[] args) {
		String s="Hello Hi Bye Welcome";
		String[] arr=s.split("");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+"");
		}

	}

}
