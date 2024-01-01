
public class LowerVowelToUpperString {

	public static void main(String[] args) {
		String s = "lalit";
        System.out.println("original string = " + s);
        System.out.println("Upper String " +s.replaceAll("a", "A")
        .replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U"));

	}

}
