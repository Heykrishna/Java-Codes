
// public class basic {
//     public static void main(String[] args) {
        
//         int a[] = new int[5];

//         // System.out.println(a[8]);

//         System.out.println("Hello guys");

//         try {

//             int result = 5/0;

//             System.out.println(a[8]);

//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Tried to acces the index out of bound element");
//         } catch(ArithmeticException e){
//             System.out.println(e);
//         }
        
//         System.out.println("Bye Guys");

        
//     }
// }




public class basic {
    public static void main(String[] args) {
        
        int a[] = new int[5];

        System.out.println("Hello guys");

        try {

            int result = 5/0;

            System.out.println(a[8]);

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Handling Exceptions");
        }
        
        System.out.println("Bye Guys");

        
    }
}








