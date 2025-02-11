
import java.util.HashSet;

public class stringHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Krishna");
        set.add("Raman");
        set.add("Rishant");
        set.add("Krishna");
        set.add("Krishna");

        System.out.println(set);
        System.out.println(set.size());

    }
}
