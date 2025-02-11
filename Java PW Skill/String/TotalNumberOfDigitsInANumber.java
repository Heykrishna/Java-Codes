
// import java.util.Scanner;

// public class TotalNumberOfDigitsInANumber {
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         String s = "" + n;

//         System.out.println(s.length());
//     }
// }


/////////////////////////////////////////////////////



import java.util.Scanner;

public class TotalNumberOfDigitsInANumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = Integer.toString(n);

        System.out.println(s.length());
    }
}
