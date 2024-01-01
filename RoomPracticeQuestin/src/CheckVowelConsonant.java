
public class CheckVowelConsonant {

	public static void main(String[] args) {
		String s ="l";
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if((c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
					||(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U')) {
				System.out.println(c+" charactor is vowel");
			}
			else {
				System.out.println(c+" charactor is Consonant");
			}
			
			}
		}

	}


