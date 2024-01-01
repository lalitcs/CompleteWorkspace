
public class StringCountCharHowManyTimePresent {

	public static void main(String[] args) {
		String s="Hello";
		char[]arr1=s.toCharArray();
		char[]arr2=s.toCharArray();
		for(int i=0;i<arr1.length;i++) {
			int Count=0;
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					Count++;
					
				}
			}
			
			System.out.println(arr1[i]+"_"+Count);
		}

	}

}
