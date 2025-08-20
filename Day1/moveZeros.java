// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

class Solution {

    public void moveZeroes(int[] nums) {
        int left = 0, right;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
