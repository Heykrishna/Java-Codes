import java.util.*;

public class ableToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("Can vote");
        }
        else if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult, can't vote");
        }
    }
}
