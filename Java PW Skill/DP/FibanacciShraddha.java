

public class FibanacciShraddha {
    // Recursive solution - O(2^n)
    public static int fibRecursive(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        return fibRecursive(n-1) + fibRecursive(n-2);
    }

    // Dynamic Programming solution - O(n)
    public static int fibDP(int n) {
        if(n <= 1) return n;
        
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }

    // Space optimized solution - O(n) time, O(1) space
    public static int fibOptimized(int n) {
        if(n <= 1) return n;
        
        int prev2 = 0;
        int prev1 = 1;
        int curr = 0;
        
        for(int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }
        
        return curr;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Recursive solution: " + fibRecursive(n));
        System.out.println("DP solution: " + fibDP(n));
        System.out.println("Space optimized solution: " + fibOptimized(n));
    }
}
