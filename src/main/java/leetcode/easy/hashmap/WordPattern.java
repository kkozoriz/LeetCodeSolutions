package leetcode.easy.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// link: https://leetcode.com/problems/word-pattern
// Runtime: 1ms
// Memory: 41.94 Mb
// 04.01.2024
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> hasmap = new HashMap<>();
        String[] arr = s.split(" ");

        if (pattern.length() != arr.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            if (!hasmap.containsKey(pattern.charAt(i)) && hasmap.containsValue(arr[i])) {
                return false;
            }
            if (!hasmap.containsValue(arr[i])) {
                hasmap.putIfAbsent(pattern.charAt(i), arr[i]);
            }

            if (!Objects.equals(hasmap.get(pattern.charAt(i)), arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(wordPattern("abba", "dog cat cat dog"));
//        System.out.println(wordPattern("abba", "dog cat cat fish"));
//        System.out.println(wordPattern("abba", "dog dog dog dog"));
//        System.out.println(wordPattern("aba", "dog cat cat"));
        System.out.println(wordPattern("aaa", "aa aa aa aa"));
    }
}
