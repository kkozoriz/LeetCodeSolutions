package leetcode.easy.arrays;

import java.util.Arrays;

// link: https://leetcode.com/problems/majority-element
// Runtime: 4ms
// Memory: 50.80 Mb
// 22.12.2023
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 3};

        System.out.println(majorityElement(nums));
    }
}
