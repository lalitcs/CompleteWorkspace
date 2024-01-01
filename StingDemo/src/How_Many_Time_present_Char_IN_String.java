
public class How_Many_Time_present_Char_IN_String {

	public static void main(String[] args){
		int[] arr=new int[128];
		String s= "Hello Apple";
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				char c=(char)i;
				System.out.println(c+"_"+arr[i]);
			}
		}

	}

}
