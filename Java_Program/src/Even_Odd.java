
public class Even_Odd {

	public static void main(String[] args) {
		int num=6;
//		if(num%2==0) {
//			System.out.println("Even");
//		}else{
//		System.out.println("Odd");
//	}
//********************************************
		if((num/2)*2==num){
			System.out.println("Even");
		}else {
		System.out.println("Odd");
		}
//*********************************************
		if((num>>1)<<1==num) {
			System.out.println("Even");
		}else {
		System.out.println("Odd");
		}
//*********************************************
		if((num&1)==0) {
			System.out.println("Even");
		}else {
		System.out.println("Odd");
		}
//**********************************************
		if((num^1)==(num+1)) {
			System.out.println("Even");
		}else {
		System.out.println("Odd");
		}
	}

}
