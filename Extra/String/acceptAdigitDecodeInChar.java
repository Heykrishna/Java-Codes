// accept a code which contains only digit from 0 to 9 and decodes in charater


import java.util.*;

public class acceptAdigitDecodeInChar {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String temp = "";   // temp variable is used to store ascii

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            temp += str;

            int a = Integer.parseInt(temp);

            // integer.parseInt(String s) is a method used to convert a String representation of a number into its corresponding int value.

            if((a >= 65 && a <=90) || (a >= 97 && a <= 122)){
                System.out.print((char)a);
                temp = "";
            }

        }

    }
}
