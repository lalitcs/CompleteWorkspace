
public class StringReverseEvenPosition {

	public static void main(String[] args) {
		String s="Hello Hi Bye ABCD Welcome";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.println(arr[i]+"");
			}
			else {
				String s1=arr[i];
				String res="";
				for(int j=s1.length()-1;j>=0;j--) {
					res=res+s1.charAt(j);
				}
				System.out.println(res);
			}
		}

	}

}
