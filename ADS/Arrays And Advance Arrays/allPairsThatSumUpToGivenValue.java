import java.util.HashSet;
import java.util.Set;

public class allPairsThatSumUpToGivenValue {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetSum = 10;
        findPairs(array, targetSum);
    }

    public static void findPairs(int[] array, int targetSum) {
        Set<Integer> seenNumbers = new HashSet<>();
        Set<String> pairs = new HashSet<>();

        for (int num : array) {
            int complement = targetSum - num;
            if (seenNumbers.contains(complement)) {
                String pair = Math.min(num, complement) + "," + Math.max(num, complement);
                pairs.add(pair);
            }
            seenNumbers.add(num);
        }

        for (String pair : pairs) {
            System.out.println("Pair: (" + pair.replace(",", ", ") + ")");
        }
    }
}
