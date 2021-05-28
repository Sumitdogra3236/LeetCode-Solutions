//  Not optimised - Begineer friendly approach

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        int len = nums.length;

        int fo = -1;
        int lo = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == target) {
                res[0] = i;
                break;
            }
        }
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] == target) {
                res[1] = i;
                break;
            }
        }
        return res;
    }
}