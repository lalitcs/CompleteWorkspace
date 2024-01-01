public class OccuranceChar {
	public static void main(String[] args) {
			String s="hello";
			char arr1[]=s.toCharArray();
			char arr2[]=s.toCharArray();
			int len=0;
			for(char ele:arr1) {
				len++;
			}
			for(int i=0;i<len;i++) {
				int c=0;
				for(int j=0;j<len;j++) {
					if(arr1[i]==arr2[j]) {
						c++;
						arr2[j]='\0';
					}
				}
				if(c>0) {
					System.out.println(arr1[i]+"-"+c);
				}
			}
			
		}
	}



