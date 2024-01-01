public class SumOfMinORMaxOfArray {
	    public static void main(String[] args) {
	        int[] array = {5, 12, 3, 9, 7, 1}; 	        
	        int min = array[0];
	        int max = array[0];
	        for (int num : array) {
	            if (num < min) {
	                min = num;
	            }
	            if (num > max) {
	                max = num;
	            }
	        }

	        int sum = min + max;
	        System.out.println("Minimum: " + min);
	        System.out.println("Maximum: " + max);
	        System.out.println("Sum of Minimum and Maximum: " + sum);
	    }
	}



