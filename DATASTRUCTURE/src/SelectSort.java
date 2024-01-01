public class SelectSort {

	public static void main(String[] args) {
		int[] arr= {5,3,1,2,4};
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int ele:arr) {
			System.out.print(ele+"");
		}

	}

}
