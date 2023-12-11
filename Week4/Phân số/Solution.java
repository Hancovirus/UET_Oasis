// Import your library
// Do not change the name of the Solution class
public class Solution {
    // Type your main code here
    private int numerator;
    private int denominator;

    public void setNumerator(int n) {
        this.numerator = n;
    }

    public int getNumerator() {
        return numerator;
    }

    /**
     * Hello, I am a Javadoc.
     */
    public void setDenominator(int d) {
        if (d != 0) {
            this.denominator = d;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    Solution(int n, int d) {
        this.numerator = n;
        if (d != 0) {
            this.denominator = d;
        } else {
            this.denominator = 1;
        }
    }

    public Solution() {
        this.denominator = 1;
    }

    /**
     * Hello, I am a Javadoc.
     */
    public Solution reduce() {
        int n = numerator;
        int d = denominator;
        int gcd;
        if (n < 0) {
            n = -n;
        }
        if (d < 0) {
            d = -d;
        }
        while (n > 0 && d > 0) {
            if (n > d) {
                n = n % d;
            } else {
                d = d % n;
            }
        }
        if (n == 0) {
            gcd = d;
        } else {
            gcd = n;
        }
        Solution ans = new Solution(numerator / gcd, denominator / gcd);
        return ans;
    }

    /**
     * Hello, I am a Javadoc.
     */
    public Solution add(Solution s) {
        int t = s.getNumerator();
        int p = s.getDenominator();
        Solution v = new Solution(t * denominator + p * numerator, p * denominator);
        return v.reduce();
    }

    /**
     * Hello, I am a Javadoc.
     */
    public Solution subtract(Solution s) {
        int t = s.getNumerator();
        int p = s.getDenominator();
        Solution v = new Solution(p * numerator - t * denominator, p * denominator);
        return v.reduce();
    }

    /**
     * Hello, I am a Javadoc.
     */
    public Solution multiply(Solution s) {
        int t = s.getNumerator();
        int p = s.getDenominator();
        Solution v = new Solution(t * numerator, p * denominator);
        return v.reduce();
    }

    /**
     * Hello, I am a Javadoc.
     */
    public Solution divide(Solution s) {
        int t = s.getNumerator();
        int p = s.getDenominator();
        Solution v = new Solution(p * numerator, t * denominator);
        return v.reduce();
    }

    /**
     * Hello, I am a Javadoc.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (other.getNumerator() * denominator == other.getDenominator() * numerator) {
                return true;
            }
            return false;
        }
        return false;
    }
}   