
import java.util.Arrays;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuffer s = new StringBuffer();
        String first = strs[0];
        String last = strs[strs.length - 1];
        for (int i = 0; i < (Math.min(first.length(), last.length())); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return s.toString();
            }
            s.append(first.charAt(i));
        }
        return s.toString();
    }
}
