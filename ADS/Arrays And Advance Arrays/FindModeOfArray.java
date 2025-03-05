// Finding the mode of an array in constant time after pre-processing.

import java.util.HashMap;
import java.util.Map;

public class FindModeOfArray {
    private static int mode;
    private static Map<Integer, Integer> frequencyMap;

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 3, 5, 3, 6, 3};

        preprocess(array);
        System.out.println("Mode of the array is: " + getMode());
    }

    // Preprocess the array to find the mode
    public static void preprocess(int[] array) {
        frequencyMap = new HashMap<>();
        int maxCount = 0;

        for (int num : array) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }
    }

    // Get the mode of the array
    public static int getMode() {
        return mode;
    }
}
