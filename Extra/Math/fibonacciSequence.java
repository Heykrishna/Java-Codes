// Generate the Fibonacci sequence up to the nth term
// 0 1 1 2 3 5 8 13 21 34


import java.util.*;

public class fibonacciSequence {

    public static void printFibonacci(int n){

        int a = 0, b = 1;

        for(int i = 0; i < n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        printFibonacci(n);

    }   
}
