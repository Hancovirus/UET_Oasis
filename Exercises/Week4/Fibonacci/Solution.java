// Import your library
// Do not change the name of the Solution class
public class Solution {
    /**
     * Hello, I am a Javadoc.
     */
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 1 || n == 0) {
            return n;
        }
        long fx1 = 1;
        long fx2 = 0;
        long i = 2;
        long temp = 0;
        while (i != n) {
            i++;
            temp = fx1;
            fx1 = fx1 + fx2;
            fx2 = temp;
            if (Long.MAX_VALUE - fx1 < fx2) {
                return Long.MAX_VALUE;
            }
        }
        return fx1 + fx2;
    }
}