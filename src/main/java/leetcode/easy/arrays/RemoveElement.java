package leetcode.easy.arrays;

//TODO:
// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
// The order of the elements may be changed.
// Then return the number of elements in nums which are not equal to val.
// Consider the number of elements in nums which are not equal to val be k,
// to get accepted, you need to do the following things:
// Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
// The remaining elements of nums are not important as well as the size of nums.
// Return k.

//16.12.2023
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
