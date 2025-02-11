import java.util.*;

public class findDuplicateCharInString {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count = 0;

        char arr[] = str.toCharArray();

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate char is " + arr[i]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
