public class largestIn2dArray {
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        int mx = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > mx) mx = arr[i][j];            }
        }

        System.out.println(mx); 
    }
}
