import java.util.*;

public class numberOfVowelsInString {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        int count = 0;

        for(int i=0; i<name.length(); i++){
            
            char ch = name.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                count++;
            }
        }
        System.out.println("Total number of vowels : " + count);
    }

}
