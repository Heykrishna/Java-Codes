import java.util.*;

public class factorialCalculation {

    public static long factorial(int n){
        if(n == 0) {
            return 1;
        }
        long result = 1;

        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long result = factorial(n);

        System.out.println(result);

    }
}
