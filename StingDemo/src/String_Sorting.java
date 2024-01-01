
public class String_Sorting {

	public static void main(String[] args) {
		String s="bcaefd";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String ans=new String(arr);
		System.out.println(ans);
			

	}

}
