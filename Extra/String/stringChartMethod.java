public class stringChartMethod {

    public static void printLetter(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {

        String firstName = "Shraddha";
        // System.out.println(firstName.charAt(3));

        printLetter(firstName);
    }
}