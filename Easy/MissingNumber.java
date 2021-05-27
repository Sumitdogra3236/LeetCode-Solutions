// Find the missing number in the array

class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        int n = nums.length;
        int sumAll = n * (n + 1) / 2;
        return sumAll - sum;
    }
}