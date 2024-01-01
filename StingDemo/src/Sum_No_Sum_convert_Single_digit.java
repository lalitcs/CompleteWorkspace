
public class Sum_No_Sum_convert_Single_digit {
		    public static int sumSingleDigitSum(int num) {
		    	while (num > 9) {
		    		int sum = 0;
		            while (num != 0) {
		                sum =sum+num % 10;
		                num=num/10;
		            }
		            num = sum;
		        }
		        return num;
		    }
		    public static void main(String[] args) {
		        int givenNumber = 145; 
		        int sum =sumSingleDigitSum(givenNumber);
		        System.out.println("sum of number and convert single digit  " + sum);
		    }
		


	}


