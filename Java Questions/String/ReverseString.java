// krishna 
// anhsirk

import java.util.*;

public class ReverseString {
    
    public String reverseString(String str){
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ReverseString rs = new ReverseString();

        System.out.println(rs.reverseString(str));
    }
}
