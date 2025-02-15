
public class PassingArrayToMethods {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);

        change(x);
        System.out.println(change);
    }


    

    public static void change(int x) {
        x = 10;
    }
}
