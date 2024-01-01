import java.util.*;
public class RemoveVowelString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		String s2="";	
		for(int i=0;i<s.length();i++){
		char c=s.charAt(i);
		if(c=='A'||c=='E'||c=='I'||c =='0'||c =='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
		continue;
		}
		s2=s2+c;
		}
		System.out.print(s2);
		
		
		
//		 String s = "LaLIT";
//		 String s1 = "";
//	     s1 = s.replaceAll("[aeiou]", ""); 
//	     System.out.println("after remove vowel : "+s1); 
		}

	}


