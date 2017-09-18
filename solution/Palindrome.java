class Palindrome {

	public static boolean isPalindrome(String text) {
		int textLength = text.length();
		if (textLength <= 1) {
			return true;
		} else {
			char firstChar = text.charAt(0);
			char lastChar = text.charAt(textLength - 1);
			System.out.print("text: " + text + "\n");
			System.out.print("firstChar: " + firstChar + "\n");
			System.out.print("lastChar: " + lastChar + "\n");
			if (firstChar != lastChar) {
				return false;
			}
			return isPalindrome(text.substring(1).substring(0, textLength - 2));
		}
	}
}