package recursion;

public class RecursionFactorial {

    public static int findFactorial(int n) {
        if(n==1 || n==0) {
            return 1;
        }
        int fact_nm1 =  findFactorial(n-1);
        int fact_n = n * fact_nm1;
        System.out.println(fact_n);
        return fact_n;
    }

    public static void main(String... arga) {
        System.out.println(findFactorial(5));
    }
}
