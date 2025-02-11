import java.util.*;

public class CountVowel {

    public int countVowel(String str){

        int count = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                count++;
            }
            else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // Create an instance of CountVowel
        CountVowel cv = new CountVowel();
        
        // Call the countVowel method and store the result
        int vowelCount = cv.countVowel(str);

        System.out.println(vowelCount);

    }
}
