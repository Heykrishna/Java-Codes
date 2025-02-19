// calculate the sum of all elements in given array 



import java.util.*;

public class calculateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}




// class Result {
//     static int calculateSum(int[] arr) {
//         int sum = 0;
//         for(int i=0; i<arr.length; i++) {
//             sum += arr[i];
//         }
//         return sum;
//     }
// }
