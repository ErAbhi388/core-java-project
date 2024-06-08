package recursion;

public class RecursionReverseString {

    static void reverseString(String s) {
        int index = 0;
        int len = s.length();
        if(len==1){
            System.out.println(s.charAt(0));
            return;
        }
        System.out.print(s.charAt(len-1));
        reverseString(s.substring(0,len-1));
    }
    public static void main(String[] args) {
        reverseString("Abhishek");
    }
}
