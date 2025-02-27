public class nextGreatestElements {
    public static void main(String[] args) {
        

        int[] arr = {12, 8, 11, 10, 5, 6, 2, 30};
        int n = arr.length;
        int[] ans = new int[n];

        ans[n-1] = -1;

        for(int i=0; i<n-1; i++){
            int mx = Integer.MIN_VALUE;
            for(int j=i+1; j<n; j++){
                if(arr[j] > mx){
                    mx = arr[j];
                }
            }
        }
        
        




    }
}
