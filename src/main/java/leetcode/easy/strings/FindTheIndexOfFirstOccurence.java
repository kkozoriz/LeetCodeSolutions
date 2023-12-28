package leetcode.easy.strings;

// link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string
// Runtime: 0ms
// Memory: 40.86 Mb
// 28.12.2023
public class FindTheIndexOfFirstOccurence {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "butsad";
        String needle = "sad";

        System.out.println(strStr(haystack, needle));
    }
}
