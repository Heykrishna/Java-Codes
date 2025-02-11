public class basic2 {
    public static void main(String[] args) {
        
        int a[] = new int[5];
        
        System.out.println("Hello World");

        try{
            System.out.println(a[3]);
        }catch(Exception e){
            System.out.println("Exceptions Handled");
        }finally{
            System.out.println("I will run always");
        }

        System.out.println("Bye world");
    }
}
