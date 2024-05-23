
public class BubbleSort {

    public static void display(int[] arr) {
        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j] + ", ");
        }
    }

    //Time complexity --> O(n^2).

    public static void main(String[] args) {
        int[] arr = {12,10,5,3,98,2};

        for(int i = 0; i<arr.length-1; i++) {
            for(int j=0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }

        display(arr);
    }

}
