// For a given set of String, print the largest string
// "apple", "mango", "banana"

// we will use compareTo function - used for comparing 2 string

public class largestString {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};

        String largest = fruits[0];      // hmne phel wali string ko largest le liya 
        for(int i=1; i<fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0 ) {
                largest = fruits[i];
            }
        }

        System.out.println(largest);
    }
}
