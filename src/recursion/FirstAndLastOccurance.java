package recursion;

//String is Angular -- > 0 index to 6
public class FirstAndLastOccurance {

    static int firstIndex = -1;
    static int lastIndex = -1;

    static void firstAndLastOccurance(String s, int indx, char a) {
        int len = s.length();
        if (indx==len) {
            System.out.println("Occurance of first element  is : " + firstIndex);
            System.out.println("Occurance of last element is : "  + lastIndex);
            return;
        }
        if(s.charAt(indx)==a) {
            if(firstIndex==-1) {
                firstIndex = indx;
            }
            lastIndex = indx;
        }

        firstAndLastOccurance(s, indx+1, a);

    }

    public static void main(String[] args) {
        String s = "bbabbha";
        firstAndLastOccurance(s, 0, 'a');
    }

}
