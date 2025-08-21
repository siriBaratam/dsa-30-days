
import java.util.HashMap;
import java.util.Map;

class Solution {

    public int firstUniqChar(String s) {
        Map<Character, Integer> count = new HashMap<>();

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (count.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
