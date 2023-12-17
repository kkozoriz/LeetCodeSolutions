package leetcode.easy.arrays;

// link: https://leetcode.com/problems/remove-element
// Runtime: 0ms
// Memory: 41.7 Mb
// 16.12.2023
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != val) {
                i++;
            } else if (nums[j] != val) {
                nums[i] = nums[j];
                nums[j] = val;
                j = i;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        int value = 3;

        System.out.println(removeElement(arr, value));
    }
}
