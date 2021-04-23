// Code of Running Sum of 1D Array in Leet Code.
class RunningSumof1DArray {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        res[0] = nums[0];
        for(int i=1;i<len;i++){
             res[i] = res[i-1] + nums[i];
        }
        return res;
    }
}
