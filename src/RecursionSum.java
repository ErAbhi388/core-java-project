public class RecursionSum {


    public static void addByRecursion(int i, int n, int sum) {
        if(i==n) {
            sum=sum + i;
            System.out.println("Sum of first "+n+" numbers is "+ sum);
            return;
        }
        sum = sum + i;
        //System.out.println("sum = "+ sum);
        addByRecursion(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        addByRecursion(1, 3, 0);
    }
}
