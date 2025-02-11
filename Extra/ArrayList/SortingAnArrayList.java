import java.util.*;

public class SortingAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);

        // ascending
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
