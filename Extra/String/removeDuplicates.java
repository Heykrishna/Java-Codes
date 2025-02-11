import java.util.*;

public class removeDuplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = "";

        for(int i=0; i<str.length(); i++){

            String s = "" + str.charAt(i);
            if(res.contains(s)){
                continue;
            }
            res += s;
        }

        System.out.println(res);

    }
}
