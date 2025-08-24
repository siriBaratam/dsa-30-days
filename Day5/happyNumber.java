
import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();
        while (!visit.contains(n)) {
            int sumOfSquares = 0;
            visit.add(n);
            if (n == 1) {
                return true;
            }
            while (n != 0) {
                int r = n % 10;
                sumOfSquares += r * r;
                n /= 10;
            }
            n = sumOfSquares;
        }
        return false;
    }
}
