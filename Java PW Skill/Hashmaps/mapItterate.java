
import java.util.HashMap;

public class mapItterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Raghav", 76);
        map.put("Himanshu", 34);
        map.put("Shivam", 56);
        map.put("Ayushi", 32);
        map.put("Prachi", 12);

        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key + " " + val);
        }

        System.out.println();

        for(int val: map.values()){
            System.out.println(val);
        }

        for(Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
