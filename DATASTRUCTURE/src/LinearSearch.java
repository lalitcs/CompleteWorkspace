public class LinearSearch {
	static int search(int[]arr,int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr= {12,55,2,7,88,99,100};
		System.out.println(search(arr,12));
		System.out.println(search(arr,100));
		System.out.println(search(arr,6757));

	}

}
