public class PreZeros {

    public static void display(int[] arr) {
        int len = arr.length;
        int counter = 0;
        for(int i = 0; i < len ; i++) {
            if(arr[i] != 0) {
                arr[counter] = arr[i];
                counter++;
            } else {

            }
        }
        for(int j = counter; j < len; j++) {
            arr[j] = 0;
        }

        for (int element : arr){
            System.out.println(element);
        }
    }
    public static void main(String... args) {
        int[] arr = {1,2,0,55,6,7,0};
        display(arr);
    }
}
