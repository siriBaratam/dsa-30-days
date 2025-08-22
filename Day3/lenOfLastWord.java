
class Solution {

    public int lengthOfLastWord(String s) {
        int wordLen = 0;
        boolean letterSeen = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                wordLen++;
                letterSeen = true;
            } else if (letterSeen) {
                return wordLen;
            }
        }
        return wordLen == 0 ? s.length() : wordLen;
    }
}
