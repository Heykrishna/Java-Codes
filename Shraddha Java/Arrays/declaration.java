import java.util.*;

public class declaration {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();    // phy
        marks[1] = sc.nextInt();    // chem
        marks[2] = sc.nextInt();    // math

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        marks[2] = 100;
        System.out.println("Updated marks maths: " + marks[2]);

        int perc = (marks[0] + marks[1] + marks[2])/3;

        System.out.println("Percentage :" +  perc + "%");
    }
}
