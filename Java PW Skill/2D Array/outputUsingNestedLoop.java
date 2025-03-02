
import java.util.*;

public class outputUsingNestedLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[][] arr = new int[2][5];

        // arr[0][0] = 9;

        // input 
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }



        // Output of 2D array 
        for(int i=0; i<2; i++){     // rows
            for(int j=0; j<3; j++){         // cols
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
