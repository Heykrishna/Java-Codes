import java.util.*;

public class checkPalindrome2 {
    
    public static boolean CheckPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1; i>=0; i--){
            rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        else{
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(CheckPalindrome(str)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
