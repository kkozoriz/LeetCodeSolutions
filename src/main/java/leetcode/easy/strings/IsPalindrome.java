package leetcode.easy.strings;

// link: https://leetcode.com/problems/valid-palindrome
// Runtime: 18ms
// Memory: 44.93 Mb
// 02.01.2024
public class IsPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s|\\W|_", "").trim().toLowerCase();

        StringBuilder reverseString = new StringBuilder(s);
        return s.contentEquals(reverseString.reverse());

    }

    public static void main(String[] args) {
        String string = "ab_a";

        System.out.println(isPalindrome(string));
    }
}
