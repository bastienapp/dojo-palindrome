class Palindrome {

    public static boolean check(String test) throws IllegalArgumentException {

        if (test == null) {
            throw new IllegalArgumentException("Argurment is null");
        }
        for (int i = 0; i < Math.floor(test.length() / 2); i++) {
            if (test.charAt(i) != test.charAt(test.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
