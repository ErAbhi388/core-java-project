package recursion;

public class KeypadCombination {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printKeypadCombination(String str, int indx, String combo) {

        if (indx == str.length()) {
            System.out.println(combo);
            return;
        }

        String keypadString = keypad[str.charAt(indx) - '0']; //it returns us the keypad string
        for(int i = 0; i < keypadString.length(); i++) {
           // System.out.println("Loop number " + i + " " + combo);
            printKeypadCombination(str, indx+1, combo + keypadString.charAt(i));
        }

    }

    public static void main(String[] args) {
        printKeypadCombination("12", 0, "");
    }
}
