
public class Count_No_Of_AL_SC_Length {

	public static void main(String[] args) {
		String s="Lal2@3";
		int alph=0;
		int num=0;
		int sc=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='A' && c<='z')||(c>='a' && c<='z')) {
				alph++;
			}
			else if(c>='0' && c<='9') {
				num++;
			}
			else {
				sc++;
			}
		
		}
		System.out.println("Alpha:"+alph);
		System.out.println("numeric:"+num);
		System.out.println("special:"+sc);

	}

}
