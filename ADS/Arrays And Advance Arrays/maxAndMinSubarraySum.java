// Problems related to continuous subarrays, like finding maximum or minimum sums

public class maxAndMinSubarraySum {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 10, -4, 7, 2, -5};

        int maxSum = findMaxSubarraySum(array);
        int minSum = findMinSubarraySum(array);

        System.out.println("Maximum subarray sum is: " + maxSum);
        System.out.println("Minimum subarray sum is: " + minSum);
    }

    // Function to find the maximum subarray sum using Kadane's algorithm
    public static int findMaxSubarraySum(int[] array) {
        int maxSoFar = array[0];
        int maxEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            maxEndingHere = Math.max(array[i], maxEndingHere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    // Function to find the minimum subarray sum
    public static int findMinSubarraySum(int[] array) {
        int minSoFar = array[0];
        int minEndingHere = array[0];

        for (int i = 1; i < array.length; i++) {
            minEndingHere = Math.min(array[i], minEndingHere + array[i]);
            minSoFar = Math.min(minSoFar, minEndingHere);
        }

        return minSoFar;
    }
}