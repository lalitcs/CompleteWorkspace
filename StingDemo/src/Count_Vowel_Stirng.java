
public class Count_Vowel_Stirng {

	public static void main(String[] args) {
		String s ="Lalit Kumar from bihar";
		int count =0;
		/*//s=s.toLowerCase();
		s=s.toUpperCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			//if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
				if(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')*/
		for(int i=0;i<s.length();i++)
		{   char c=s.charAt(i);
			if((c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
				||(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U'))
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
