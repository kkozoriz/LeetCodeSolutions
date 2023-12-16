package leetcode.easy.strings;

import java.util.HashMap;

//TODO:Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//  Symbol       Value
//  I             1
//  V             5
//  X             10
//  L             50
//  C             100
//  D             500
//  M             1000
//  For example, 2 is written as II in Roman numeral, just two ones added together.
//  12 is written as XII, which is simply X + II.
//  The number 27 is written as XXVII, which is XX + V + II.
//  Roman numerals are usually written largest to smallest from left to right.
//  However, the numeral for four is not IIII.
//  Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
//  The same principle applies to the number nine, which is written as IX.
//  There are six instances where subtraction is used:
//  I can be placed before V (5) and X (10) to make 4 and 9.
//  X can be placed before L (50) and C (100) to make 40 and 90.
//  C can be placed before D (500) and M (1000) to make 400 and 900.
//  Given a roman numeral, convert it to an integer.

//07.12.2023
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