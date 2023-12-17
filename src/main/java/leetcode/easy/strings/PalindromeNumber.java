package leetcode.easy.strings;

// link: https://leetcode.com/problems/palindrome-number
// Runtime: 6ms
// Memory: 43 Mb
// 12.12.2023
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        StringBuilder reverseString = new StringBuilder(string);
        return string.contentEquals(reverseString.reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
