

// public class sortOsAnd1s {
//     public static void main(String[] args) {

//         int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
//         int n = arr.length;

//         int noOfOnes = 0;
//         int noOfZeros = 0;

//         for(int i=0; i<n; i++){
//             if(arr[i] == 0){
//                 noOfZeros++;
//             }
//             else{
//                 noOfOnes++;
//             }
//         }
//         for(int i=0; i<noOfZeros; i++){
//             arr[i] = 0;
//         }
//         for(int i=noOfZeros; i<n; i++){
//             arr[i] = 1;
//         }

//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }



//////////////////////////////////////////////////////////////////////////////////////////////////////////////



public class sortOsAnd1s {
    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        int n = arr.length;

        int noOfOnes = 0;
        int noOfZeros = 0;

        int i=0, j=n-1;

        while(i<j){
            if(arr[i]==0) i++;
            if(arr[j]==1) j--;
            // if(i>j) break;

            if(i<j && arr[i]==1 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele + " ");
        }


    }
}







