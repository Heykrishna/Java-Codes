// occurance of each character in a string

import java.util.*;

public class occuranceOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char arr[] = str.toCharArray();

        int count = 0;

        Map<Character, Integer> map = new TreeMap<Character, Integer>();

        for(int i=0; i<arr.length; i++){

            count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            // store char and count 
            map.put(arr[i], count);
        }

        System.out.println(map);

    }
}
