package leetcode.easy.strings;

import java.util.HashMap;

// link: https://leetcode.com/problems/roman-to-integer
// Runtime: 5ms
// Memory: 43.7 Mb
// 05.12.2023
public class RomanToInteger {
    public static int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();

        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && (hashMap.get(s.charAt(i)) < hashMap.get(s.charAt(i + 1)))) {
                result += (hashMap.get(s.charAt(i + 1)) - hashMap.get(s.charAt(i)));
                i++;
            } else {
                result += hashMap.get(s.charAt(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}