
public class StringCompareOneElementToAll {

	public static void main(String[] args) {
		String s="Hello";
		char[] arr1=s.toCharArray();
		char[] arr2=s.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				System.out.println(arr1[i]+""+arr2[j]);
			}
			System.out.println();
		}

	}

}
