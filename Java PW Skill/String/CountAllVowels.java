import java.util.*;

public class CountAllVowels {

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int count = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);

            if(isVowel(ch))  count++;
        }
        System.out.println("Number of vowels: " + count);
    }
}