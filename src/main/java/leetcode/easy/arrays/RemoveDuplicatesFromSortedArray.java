package leetcode.easy.arrays;

import java.util.HashSet;
import java.util.Set;

// link: https://leetcode.com/problems/remove-duplicates-from-sorted-array
// Runtime: 3ms
// Memory: 43.8 Mb
// 15.12.2023
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int index = 0, count = 0;
        Set<Integer> set = new HashSet<>();

        if (nums.length == 0) {
            return 0;
        }

        set.add(nums[0]);
        for (int i = 0; i < nums.length - 1; i++) {
            if (!set.contains(nums[i + 1]) && count == 0) {
                set.add(nums[i + 1]);
                index++;
            } else if (!set.contains(nums[i + 1]) && count >= 1) {
                set.add(nums[i + 1]);
                var tmp = nums[i + 1];
                nums[i + 1] = nums[index + 1];
                nums[index + 1] = tmp;
                index++;
            } else {
                count++;
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] array = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        System.out.println(removeDuplicates(array));
    }
}
