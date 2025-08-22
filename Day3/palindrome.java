
class Solution {

    public boolean isPalindrome(int x) {
        int temp = (x >= 0) ? x : -x;
        int r, res = 0;
        while (x != 0) {
            r = x % 10;
            res = 10 * res + r;
            x = x / 10;
        }
        return res == temp ? true : false;
    }
}
