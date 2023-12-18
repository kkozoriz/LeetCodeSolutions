package leetcode.easy.arrays;

import java.util.Arrays;

// link: https://leetcode.com/problems/plus-one
// Runtime: 0ms
// Memory: 40.43 Mb
// 18.12.2023
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        var length = digits.length;

        if (digits[length - 1] == 9) {
            var i = length - 1;
            while (digits[i] == 9 && i > 0) {
                digits[i] = 0;
                i--;
            }
            if (i == 0 && digits[i] == 9) {
                digits = Arrays.copyOf(digits, length + 1);
                digits[0] = 0;
            }
            digits[i]++;
        } else {
            digits[length - 1]++;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9, 9, 9, 9};

        System.out.println(Arrays.toString(plusOne(nums)));
    }
}


//1299 = 1300
//1929 = 1930
// 99 = 100
// 1999 = 2000