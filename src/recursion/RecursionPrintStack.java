package recursion;

public class RecursionPrintStack {

    public static int printStackHeigt(int x, int h) {
        if(h==0){
            return 1;
        }
        return x * printStackHeigt(x,h-1);
    }
    public static void main(String[] args) {
        System.out.println(printStackHeigt(2,3));
    }
}
