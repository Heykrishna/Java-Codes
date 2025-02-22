
// Brute force solution
// Time complexity: O(n^2)

// public class SingleNumber {
//     public int singleNumber(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[i] == nums[j]) {
//                     count++;
//                 }
//             }
//             if (count == 1) {
//                 return nums[i];
//             }
//         }
//         return -1; // This line should never be reached if the input is valid
//     }

//     public static void main(String[] args) {
//         SingleNumber sn = new SingleNumber();
//         int[] nums = {4, 1, 2, 1, 2};
//         System.out.println(sn.singleNumber(nums)); // Output: 4
//     }
// }




/////////////////////////////////////////////////////////////




// public class SingleNumber {
//     public int singleNumber(int[] nums) {
//         int result = 0;
//         for (int num : nums) {
//             result ^= num;
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         SingleNumber sn = new SingleNumber();
//         int[] nums = {4, 1, 2, 1, 2};
//         System.out.println(sn.singleNumber(nums)); // Output: 4
//     }
// }



////////////////////////////////////////////////////////////////




import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1; // This line should never be reached if the input is valid
    }

    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(sn.singleNumber(nums)); // Output: 4
    }
}