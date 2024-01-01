
public class TwoCharSwap {

	public static void main(String[] args) {
		String s="LALIT";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length-1;i=i+2) {
			char temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		System.out.println(new String(arr));

	}

}
