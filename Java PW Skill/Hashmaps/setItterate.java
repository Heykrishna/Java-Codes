
import java.util.HashSet;

public class setItterate {
    public static void main(String[] args) {
        
        int[] arr = {4, 9, 2, 5, 6, 1};
        
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        //////////////////////////////////////////////////

        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);

        for(int ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();
        
        // for emptying the set 
        set.clear();

        for(int ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();
        
        // agar aik element set me phle se hota hai, to wo wps se add nhi hota hai, aur size bhi change nhi hota extra add krne se 

        set.add(20);

        

    }
}
