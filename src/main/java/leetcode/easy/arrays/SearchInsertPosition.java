package leetcode.easy.arrays;

// link: https://leetcode.com/problems/search-insert-position
// Runtime: 0ms
// Memory: 43.4 Mb
// 17.12.2023
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
