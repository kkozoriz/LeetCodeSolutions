package leetcode.easy.arrays;

import java.util.Arrays;

// link: https://leetcode.com/problems/single-number
// Runtime: 8ms
// Memory: 46.20 Mb
// 21.12.2023
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int count = 0;
        int length = nums.length;
        Arrays.sort(nums);
        if (length == 1) {
            return nums[0];
        }
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (i + 1 == length - 1) {
                    return nums[i + 1];
                }
                if (count == 0) return nums[i];
                else count = 0;
            }
            else {count++;}
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{4,1,2, 2,1};

        System.out.println(singleNumber(arr1));
    }
}
