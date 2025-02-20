public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 5; // Example number of stairs
        System.out.println("Number of ways to climb " + n + " stairs: " + climbStairs(n));
    }
    
    public static int climbStairs(int n) {
        // Base cases
        if (n <= 2) {
            return n;
        }
        
        // Create array to store number of ways for each step
        int[] dp = new int[n + 1];
        
        // Initialize base cases
        dp[1] = 1; // One way to climb 1 stair
        dp[2] = 2; // Two ways to climb 2 stairs
        
        // Fill dp array
        for (int i = 3; i <= n; i++) {
            // At each step, we can either take 1 step from (i-1)
            // or take 2 steps from (i-2)
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n];
    }
}
