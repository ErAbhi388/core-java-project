package recursion;

public class CheckIfArrayIsSorted {

    static boolean flag = true;

    static boolean isSorted(int[] a, int index) {
        if (index == a.length - 1) {
            return true;
        }
        if (a[index] > a[index + 1]) {
            return false;
        }

        return isSorted(a, index + 1);
    }

    public static void main(String[] args) {

        int[] arr={1,3,4,5,2};
        System.out.println(isSorted(arr,0));
    }

}
