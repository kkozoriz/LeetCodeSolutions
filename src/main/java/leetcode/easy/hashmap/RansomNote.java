package leetcode.easy.hashmap;

import java.util.HashMap;
import java.util.Map;

// link: https://leetcode.com/problems/ransom-note
// Runtime: 16ms
// Memory: 45.09 Mb
// 07.01.2024
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        Map<Character, Integer> ransomNoteMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            Integer n = magazineMap.get(magazine.charAt(i));
            if (n == null) magazineMap.put(magazine.charAt(i), 1);
            else magazineMap.put(magazine.charAt(i), ++n);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            Integer n = ransomNoteMap.get(ransomNote.charAt(i));
            if (n == null) ransomNoteMap.put(ransomNote.charAt(i), 1);
            else ransomNoteMap.put(ransomNote.charAt(i), ++n);
        }

        for (Map.Entry<Character, Integer> entry : ransomNoteMap.entrySet()) {
            if (magazineMap.containsKey(entry.getKey())) {
                if (entry.getValue() > magazineMap.get(entry.getKey())) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomNote = "a";
        String magazine = "b";

        System.out.println(canConstruct(ransomNote, magazine));
    }
}
