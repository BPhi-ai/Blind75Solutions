package Week_1;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        String trimmed = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int i = 0; i < trimmed.length() / 2; i++) {
            if(trimmed.charAt(i) != trimmed.charAt(trimmed.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
