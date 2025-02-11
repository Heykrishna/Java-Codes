import java.util.*;

public class characterArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "krishna";
        char[] ch = s.toCharArray(); 

        // char[] ch = {'a', 'b', 'c', 'f', 'd', 'e'};

        // for(char ele : ch){
        //     System.out.print(ele);
        // }
        // System.out.println();
        
        Arrays.sort(ch);

        for(char ele : ch){
            System.out.print(ele);
        }
    }
}
