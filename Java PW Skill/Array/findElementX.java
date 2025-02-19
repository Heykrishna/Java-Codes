// Linear search 

import java.util.*;

public class findElementX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element");
        int target = sc.nextInt();


        // for (int i = 0; i < n; i++) {
        //     if(arr[i] == target){
        //         System.out.println("Element found");
        //     }
        //     else{
        //         System.out.println("Elemenr not found");
        //     }
        // }


        boolean flag = false;

        for (int i = 0; i < n; i++) {
            if(arr[i] == target){
                flag = true;
                break;
            }
        }

        // if(flag == true) System.out.println("Element found");
        // else System.out.println("Element not found");


        System.out.println(flag ? "Element found" : "Element not found");

    }
}



////////////////////////////////////////////////////////////////////////////////////////////////////////
