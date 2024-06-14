package recursion;

public class MovingAllCharactersToEnd {

    static void moveCharater(String s, int i, char c, String newString) {
        if(i==s.length()-1) {
            System.out.println(newString);
           return;
        }
        if(s.charAt(i)==c) {

            moveCharater(s, i+1, c, newString);
        } else {
            newString+=s.charAt(i);
            moveCharater(s,i+1,c,newString);
        }
    }

    public static void main(String[] args) {
        String s = "abbcc";
        moveCharater(s,0,'b',"");
        System.out.println();
    }
}
