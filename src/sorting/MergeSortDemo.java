package sorting;

public class MergeSortDemo {

    public static void conquer(int[] arr, int si, int middle, int ei){
        int merged[] = new int[ei-si+1];
        int indx1 = si;
        int indx2 = middle+1;
        int x=0;
        while(indx1 <= middle && indx2 <= ei){
            if(arr[indx1] < arr[indx2]){
                merged[x++] = arr[indx1++];
            } else {
                merged[x++] = arr[indx2++];
            }
        }

        while(indx1 <= middle){
            merged[x++] = arr[indx1++];
        }

        while(indx2 <= ei){
            merged[x++] = arr[indx2++];
        }

        for(int i =0, j=si; j < merged.length; j++, i++ ) {
            arr[j]=merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
        int middle = si + (ei-si)/2;
        divide(arr, si, middle);
        divide(arr, middle+1, ei);
        conquer(arr, si, middle, ei);
    }

    public static void main(String[] args) {
       int arr[] = {1, 10, 6, 2, 5};
       int length = arr.length;
       divide(arr, 0, length-1);

       //printed sorted array

        for (int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
