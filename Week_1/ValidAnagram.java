package Week_1;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";

        System.out.println(isAnagram(a, b));
    }

    public static boolean isAnagram(String a, String b) {
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
