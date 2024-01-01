public class SelectSort1 {
	static void sort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int min=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
				int temp=arr[min];
				arr[min]=arr[j];
				arr[j]=temp;
			}
			
		}
		
	}
	public static void main(String[] args) {
		int[] arr= {5,3,1,4,2};
		sort(arr);
		for(int ele:arr) {
			System.out.println(ele+"");
		}

	}

}
