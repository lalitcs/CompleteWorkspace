
public class DuplicateIteamArraySum {

	public static void main(String[] args) {
		int arr[] = {10,20,5,5,4,20,20,5,7,12,7};
		boolean[] arr2=new boolean[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			int c=0;
			if(arr2[i]==false) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						c++;
						arr2[j]=true;
					}
				}
			}
			if(c>1) {
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
		

	}

}
