import java.util.*;

public class BasicLearning {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Operations on array list

        // Add element - O(1) - this operation takes constant time 

        list1.add(1);     // Time comlexity  for adding one element O(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
 
        System.out.println(list1);

        int element = list1.get(2);
        System.out.println(element);

        // Remove element 

        list1.remove(3);
        System.out.println(list1);

        // Set element at index

        list1.set(2, 10);
        System.out.println(list1);

        // Contains element 

        System.out.println(list1.contains(10));
        System.out.println(list1.contains(11));

        // Adding element on index 

        list1.add(1, 9);        // O(n) - this operation takes linear time 
        System.out.println(list1);

    }
}
