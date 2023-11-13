import java.util.*;
class Solution {
    public int[] maxSubsequence(int[] nums, int k) 
    {
         int n = nums.length;

        // Sort the array, take the last k elements with the largest values
        Arrays.sort(nums);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = nums[n - k + i];
        }

        return result;

    }
}