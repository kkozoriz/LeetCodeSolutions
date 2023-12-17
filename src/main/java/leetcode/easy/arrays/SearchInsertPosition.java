package leetcode.easy.arrays;

//TODO:
// Given a sorted array of distinct integers and a target value,
// return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.
// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2

//17.12.2023
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int mid, low = 0, high = nums.length - 1;

        while (low <= high) {
            mid = (high + low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                return mid;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6};
        int target = 7;

        System.out.println(searchInsert(array, target));
    }
}
