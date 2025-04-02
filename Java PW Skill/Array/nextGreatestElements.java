public class nextGreatestElements {
    public static void main(String[] args) {

        int[] arr = {12, 8, 11, 10, 5, 6, 2, 30};
        int n = arr.length;
        int[] ans = new int[n];

        // The last element has no next greater element
        ans[n - 1] = -1;

        // Iterate through the array to find the next greatest element
        for (int i = 0; i < n - 1; i++) {
            int mx = -1; // Initialize as -1 (default if no greater element exists)
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    mx = arr[j];
                    break; // Stop once the next greater element is found
                }
            }
            ans[i] = mx;
        }

        // Print the result
        System.out.println("Next greatest elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
