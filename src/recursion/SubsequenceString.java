package recursion;

//abc
public class SubsequenceString {

    static void subSeq(String s, int indx, String newString) {

        if (indx == s.length()) {
            System.out.println("subsequence of strings is -->  " + newString);
            return;
        }
        // to be
        char currentChar = s.charAt(indx);
        subSeq(s, indx+1, newString + currentChar);

        // not to be
        subSeq(s, indx+1,newString);

    }
    public static void main(String[] args) {
        String s = "abcde";
        subSeq(s, 0, "");
    }
}
