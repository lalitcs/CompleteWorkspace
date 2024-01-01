
public class RemoveDuplicatesString {
	public static void main(String[] args) {
		String inputString = "bangalore bangalore bangalore is bangalore my city";
	    String result = removeDuplicates(inputString);
	    System.out.println(result);
	    }

	    public static String removeDuplicates(String input) {
	        int length = input.length();
	        char[] inputChars = input.toCharArray();
	        StringBuilder result = new StringBuilder();
	        StringBuilder currentWord = new StringBuilder();
	        boolean isNewWord = true;

	        for (int i = 0; i < length; i++) {
	            char currentChar = inputChars[i];

	            if (Character.isWhitespace(currentChar)) {
	                String word = currentWord.toString();
	                int wordLength = word.length();

	                // Check if the current word is unique
	                boolean isUnique = true;
	                int resultLength = result.length();
	                for (int j = 0; j < resultLength - wordLength; j++) {
	                    if (result.charAt(j) == ' ') {
	                        int end = j + wordLength;
	                        if (end <= resultLength && result.substring(j + 1, end).equals(word)) {
	                            isUnique = false;
	                            break;
	                        }
	                    }
	                }

	                if (isUnique) {
	                    if (!isNewWord) {
	                        result.append(' ');
	                    }
	                    result.append(word);
	                }

	                currentWord.setLength(0);
	                isNewWord = true;
	            } else {
	                currentWord.append(currentChar);
	                isNewWord = false;
	            }
	        }

	        // Add the last word if it's unique
	        String lastWord = currentWord.toString();
	        if (!result.toString().contains(lastWord)) {
	            if (!isNewWord) {
	                result.append(' ');
	            }
	            result.append(lastWord);
	        }

	        return result.toString();
	    }
	}



