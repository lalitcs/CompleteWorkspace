
public class OccuranceWord {
		
		static int leng(String s) {
			int len=0;
			try {
				while(true) {
					s.charAt(len);
					len++;
				}
			}
			catch (Exception e) {
			}
			return len;
			
		}
		
		static int countSpace(String s,int len) {
			int c=0;
			for(int i=0;i<len;i++) {
				if(s.charAt(i)==' ') {
					c++;
				}
			}
			return c;
		}
		public static void main(String[] args) {
			String s="bangalore bangalore bangalore is bangalore my city";
			int len=leng(s);
			int alen=countSpace(s, len)+1;
			String[] arr1=new String[alen];
			String[] arr2=new String[alen];
			String temp="";
			int k=0;
			for(int i=0;i<len;i++) {
				if(s.charAt(i)!=' ') {
					temp=temp+s.charAt(i);
				}
				else {
					arr1[k]=temp;
					arr2[k]=temp;
					k++;
					temp="";
				}
			}
			arr1[k]=temp;
			arr2[k]=temp;
			String ans="";
//			String sb="bye";
//			String rp="Welcome";
//			for(int i=0;i<alen;i++) {
//				if(arr1[i].equals(sb)) {
//					ans=ans+rp+" ";
//				}
//				else {
//					ans=ans+arr1[i]+" ";
//				}
//			}
			System.out.println(ans);
			
			for(int i=0;i<alen;i++) {
				int c=0;
				for(int j=0;j<alen;j++) {
					if(arr1[i].equals(arr2[j])) {
						c++;
						arr2[j]=" ";
					}
				}
				if(c>0) {
					System.out.println(arr1[i]+"-"+c);
				}
			}
			
			
		}
	}



