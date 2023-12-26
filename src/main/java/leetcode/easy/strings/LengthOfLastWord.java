package leetcode.easy.strings;

// link: https://leetcode.com/problems/length-of-last-word
// Runtime: 0ms
// Memory: 41.55 Mb
// 26.12.2023
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (s.charAt(i) == ' ') {
            i--;
        }

        while (s.charAt(i) != ' ' && i != 0) {
            count++;
            i--;
        }

        if (i == 0 && s.charAt(i) != ' ') {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = " a";

        System.out.println(lengthOfLastWord(s));
    }
}
