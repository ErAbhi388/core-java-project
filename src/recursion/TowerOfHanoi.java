package recursion;

public class TowerOfHanoi {
    static void towerOfHanoi(int n, String source, String helper, String destination) {
        if (n==1) {
           // System.out.println("Transferring disk one from " + source +  " to " + destination);
            return;
        }
        //System.out.println("Before");
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("----Transferring  " + n + " disks from " + source+" to "+destination);
       // System.out.println("After");

       // System.out.println("Before.........");
        towerOfHanoi(n-1, helper, destination, source);
       // System.out.println("After........");

    }

    public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S","H", "D");
        System.out.println("Transferring disk one from S to D");

    }
}
