class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index++) {
            if(nums[index] == nums[index-1]) {
                return true;
            }
        }
        return false;
    }
}