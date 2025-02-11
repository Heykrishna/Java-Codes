import java.util.*;

public class SwapTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str1 + " " + str2);

        String temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println(str1 + " " + str2);

        sc.close();
    }
}