
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<>();
        if (nums.length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] - nums[i] == 0) {
                continue;
            }
            if (nums[i + 1] - nums[i] == 1) {
                count++;
            } else {
                temp.add(count);
                count = 1;
            }
        }
        temp.add(count);
        return Collections.max(temp);
    }
}
