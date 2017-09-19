class Palindrome {

	public static boolean isPalindrome(String entree) {
		char[] charArray = entree.toCharArray();
		int j = charArray.length-1;
		for (int i = 0; i < j; i++){
			if (charArray[i] != charArray[j]) {
				return false;
			}
			j--;
		}
		return true;		
	}

	public static boolean isPalindromeLoop(String entree) {
		char[] charArray = entree.toCharArray();
		for (int i = 0; i < charArray.length / 2; i++){
			if (charArray[i] != charArray[charArray.length - 1 - i]) {
				return false;
			}
		}
		return true;		
	}

	public static boolean isPalindromeReverse(String entree){		
		char[] original = entree.toCharArray();
    	char[] reverse = new char[entree.length()];
    	int j = 0;
    	for(int i = reverse.length - 1; i >= 0; i--) {
        	reverse[j] = original[i]; 
        	j++;
    	}
    	return entree.equals(String.valueOf(reverse));		
	}

	public static boolean isPalindromeRecursive(String entree) {
		int textLength = entree.length();
		if (textLength <= 1) {
			return true;
		} else {
			char firstChar = entree.charAt(0);
			char lastChar = entree.charAt(textLength - 1);
			if (firstChar != lastChar) {
				return false;
			}
			return isPalindrome(entree.substring(1).substring(0, textLength - 2));
		}
	}
}