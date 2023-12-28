package leetcode.easy.strings;

// link: https://leetcode.com/problems/is-subsequence
// Runtime: 2ms
// Memory: 41.50 Mb
// 28.12.2023
public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int j = 0;
        int count = 0;

        if (!s.isEmpty()) {
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == s.charAt(j)) {
                    count++;
                    if (j != s.length() - 1) j++;
                }
            }
        }
        else return true;

        return count == s.length();
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";

        System.out.println(isSubsequence(s, t));
    }
}
