
public class IpAddressValidation {
	static boolean Validation(String s) {
		String[] arr=s.split("[.]");
		if(arr.length!=4) {
			return false;
		}
		for(String ele:arr) {
			int n=Integer.parseInt(ele);
			if(n<0||n>255) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s="236.054.087.045";
		if(Validation(s)) {
			System.out.println("valid Ip");
		}
		else {
			System.out.println("Invalid Ip");
		}

	}

}
