// wap to find the repeated characters in a string 

// deepak gupta 
// epa


import java.util.*;

public class FindDuplicateCharacters {
    
    public static String findDuplicate(String str){
        int count = 0;

        char ch[] = str.toCharArray();   // Convert sting to characted array 

        for(int i=0; i<ch.length; i++){
            for(int j=i+1; j<ch.lenght; j++){
                if(ch[i]==ch[j]){
                    return ch[j];
                    count++;
                }
            }
        }
        System.out.println(count++);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
    }
}
