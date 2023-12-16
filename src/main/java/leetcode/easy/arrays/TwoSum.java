package leetcode.easy.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TODO: Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


//15.12.2023
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int count = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.get(nums[i]) != null && (target - nums[i] == nums[i])) {
                result[1] = i;
            } else {
                hashMap.put(nums[i], i);
            }
        }

        for (int i : hashMap.keySet()) {
            int tmp = target - i;
            if (hashMap.containsKey(tmp)) {
                if (nums.length == hashMap.size()) {
                    result[0] = hashMap.get(i);
                    result[1] = hashMap.get(tmp);

                    return result;
                } else {
                    if (count == 0) {
                        result[0] = hashMap.get(i);
                        count++;
                    } else {
                        result[1] = hashMap.get(i);
                        return result;
                    }
                }
            }
        }

        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(array, target)));
    }
}
