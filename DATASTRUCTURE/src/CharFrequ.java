public class CharFrequ {

	public static void main(String[] args) {
		String s="ABBEEDDCDGHHCC";
		int[] arr=new int[128];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++) {
			if(arr[s.charAt(i)]!=0) {
				System.out.println(s.charAt(i)+"-"+arr[s.charAt(i)]);
				arr[s.charAt(i)]=0;
			}
		}

	}

}
