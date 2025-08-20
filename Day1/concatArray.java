// Given an integer array nums of length n, you want to create an array ans of length 2n. Specifically, ans is the concatenation of two nums arrays.

class Solution {

    public int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2 * length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
