class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int nger[] = new int[nums.length];
        nger[nums.length - 1] = nums.length;
        Stack<Integer> st = new Stack<>();
        st.push(nums.length - 1);

        for (int i = nums.length - 2; i >= 0; i--) {
            while (st.size() > 0 && nums[i] > nums[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                nger[i] = nums.length;
            } else {
                nger[i] = st.peek();
            }
            st.push(i);
        }

        int j = 0;
        int res[] = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length - k + 1; i++) {
            if (j < i) {
                j = i;
            }
            while (nger[j] < i + k) {
                j = nger[j];
            }
            res[i] = nums[j];
        }
        return res;
    }
}