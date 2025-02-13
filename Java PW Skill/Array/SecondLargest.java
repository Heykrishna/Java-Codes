    // Find the second largest element in the given array 



    public class SecondLargest {

        public static void main(String[] args) {
            int[] arr = {10, 8, 12, 4, 6, 23, 8};

            int max = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
            }

            for (int i = 0; i < n; i++) {
                if(arr[i] != max){
                    smax = Math.max(smax, arr[i]);
                }
            }

            System.out.println(smax);
        }
    }
