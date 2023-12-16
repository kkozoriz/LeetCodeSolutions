package leetcode.easy.strings;

//TODO: Given an integer x, return true if x is a palindrome, and false otherwise.
//  Input: x = 121
//  Output: true
//  Explanation: 121 reads as 121 from left to right and from right to left.

//10.12.2023
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
