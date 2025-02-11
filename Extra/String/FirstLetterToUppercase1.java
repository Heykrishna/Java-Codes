import java.util.*;

public class FirstLetterToUppercase1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        for(int i=0; i<arr.length; i++){
        
            char ch = arr[i].charAt(0);
            String str1 = String.valueOf(ch).toUpperCase();

            String newString = str1 +  arr[i].substring(1);

            System.out.print(newString + " ");
        }

    }
}
