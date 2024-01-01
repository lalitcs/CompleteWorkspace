import java.util.*;
public class RemoveduplicateString{
    public static void main(String[] args) {
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter the String");
//    	String s=sc.nextLine();
        String[] inputArray = {"bangalore", "bangalore", "bangalore", "is", "bangalore","bangalore","my","city"};

        
        int length = inputArray.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (inputArray[i] != null && inputArray[i].equals(inputArray[j])) {
                   
                    for (int k = j; k < length - 1; k++) {
                        inputArray[k] = inputArray[k + 1];
                    }
                    inputArray[length - 1] = null; 
                    length--; 
                    j--; 
                }
            }
        }

        
        String[] uniqueArray = new String[length];
        System.arraycopy(inputArray, 0, uniqueArray, 0, length);

        
        for (String element : uniqueArray) {
            System.out.print(" "+element);
        }
    }
}
