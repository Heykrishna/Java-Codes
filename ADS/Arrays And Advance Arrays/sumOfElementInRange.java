// Finding the sum of elements within a given range.

public class sumOfElementInRange {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 2; // inclusive index
        int end = 5; // inclusive index
        int sum = sumInRange(array, start, end);
        System.out.println("Sum of elements from index " + start + " to " + end + " is: " + sum);
    }

    public static int sumInRange(int[] array, int start, int end) {
        
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
