public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {10, 15, 20, 40};
        int[] b = {5, 6, 6, 10, 15};


        int[] c = new int[a.length + b.length];

        int i=0, j=0, k=0;

        // merge two sorted arrays

        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++; 
            }
            k++;
        }

        if(i==a.length){
            while(j<b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        else{
            while(i<a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }

        for(int ele : c){
            System.out.print(ele + " ");
        }
    }
}
