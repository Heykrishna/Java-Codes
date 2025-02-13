
public class maxInArray {

    public static void main(String[] args) {
        int[] arr = {10, 8, 12, 4, 6, 23, 8};

        // int max = arr[0]; 
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > max) {
        //         max = arr[i];
        //     }
        // }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);
    }
}
