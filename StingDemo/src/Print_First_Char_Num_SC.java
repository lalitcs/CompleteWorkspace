
public class Print_First_Char_Num_SC {

	public static void main(String[] args) {
		String s="Ghg785@8He#%#$d4";
		String alph="";
		String num="";
		String sc="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if((c>='A' && c<='z')||(c>='a' && c<='z')) {
				alph=alph+c;
			}
			else if(c>='0' && c<='9') {
				num=num+c;
			}
			else {
				sc=sc+c;
			}
		}
		String ans=alph+num+sc;
		System.out.println(ans);

	}

}
