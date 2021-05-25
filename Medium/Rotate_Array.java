// Rotate a given array by k times
// https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k = k + nums.length;
        }
        int len = nums.length;
        reverse(nums, 0, len - 1 - k);
        reverse(nums, len - k, len - 1);
        reverse(nums, 0, len - 1);

    }

    public void reverse(int nums[], int low, int high) {
        while (low < high) {
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}