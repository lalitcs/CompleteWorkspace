public class CharManipulation {
		
		public static void main(String[] args) {
			
			String s="AbvvBBBBcf";
			int len=0;
			char[] arr=s.toCharArray();
			for(char ele:arr) {
				len++;
			}
			String ans="";
			for(int i=0;i<len;i++) {
				char c=s.charAt(i);
				if(c>='A'&&c<='Z'){
					c+=32;
					ans=ans+c;
				}
				else if(c>='a'&&c<='z') {
					c-=32;
					ans=ans+c;
				}
				else {
					ans=ans+c;
				}
			}
			System.out.println(ans);
		}

	}



