package Chapter18;

public class Recursion {

    public static void main(String[] args) {
        // 5
    }

    /**
     * Iterative Solution for Factorial
     * @param n
     * @return factorial of n
     */
    public static int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Definition
    // f(x) = x             ( x <= 1)
    // f(x) = x * f(x-1)    ( x > 1)
    public static int factorial_recur(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial_recur(n - 1);
    }

}
