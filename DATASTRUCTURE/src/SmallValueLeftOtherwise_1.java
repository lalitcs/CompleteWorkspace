public class SmallValueLeftOtherwise_1 {

	public static void main(String[] args) {
		int arr[]= {45,12,88,90,7,32,3,89,9,100};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				arr[i]=min;
			}
			else {
				min=arr[i];
				arr[i]=-1;
			}
		}
		for(int ele:arr) {
			System.out.print(ele+",");
		}

	}

}
