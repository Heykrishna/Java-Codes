

public class PrintAllSubstringOfAString {
    public static void main(String[] args) {
        
        String s = "abcde";

        for(int i=1; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                System.out.print(s.substring(i, j) + " ");
            }
        }


    }
}
