import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){

        String result = "";
        // This line initializes an empty string result that will store the output without duplicates.


        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);     // Gets the character at the current index i in the string str and assigns it to the variable c
            if(result.indexOf(c) == -1)      // Checks if the character c is not already present in the result string. If it's not found, indexOf returns -1
            result += c;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String result = removeDuplicates(str);
        System.out.println(result);

    }
}
