import java.util.*;

public class inputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // int[] arr = new int[7];
        System.out.println("Enter array size") ;
        int n = sc.nextInt();

        int[] arr = new int[n];

     
        // input 
        for(int i=0; i<=n-1; i++){
            arr[i] = sc.nextInt();
        }

        // output -> for loop 

        for(int i=0; i<=n-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
