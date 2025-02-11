

public class rough1 {
    
    public static void main(String[] args) {
        
        int n = 100;
        int count = 0;

        for(int i=1; i<=n; i*= 2){
            for(int j=1; j<=i; j++){
                count++;
            }
        }

        System.out.println(count);
    }
}
