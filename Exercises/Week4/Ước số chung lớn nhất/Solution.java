
public class Solution {
    /**
     * Hello, I am an Javadoc.
     */
    public int gcd(int a, int b) {
        int gcd;
        if (a == -2147483648 || b == -2147483648) {
            return 1;
        }
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            gcd = b;
        } else {
            gcd = a;
        }
        return gcd;
    }
}   