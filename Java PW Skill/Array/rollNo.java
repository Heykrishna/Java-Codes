



public class rollNo {    
    public static void main(String[] args){
       
        int[] arr = {81, 43, 56, 12, 56, 14, 68};
        int n = arr.length-1;

        for (int i = 0; i <= n; i++) {
            if(arr[i] < 35 ){
                System.out.print(i + " ");
            }
        }


    }
}
