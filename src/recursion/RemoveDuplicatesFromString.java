package recursion;

/*
The author of this program is Mr Abhishek Mishra
Date : 9th June, 2024
The purpose of this program is to remove all the duplicates in a string
 */

public class RemoveDuplicatesFromString {

    //String is abbfgbbhcc
    public static boolean[] map = new boolean[26];
    static void removeDuplicates(String s, int indx, String newString) {
        if(indx == s.length()) {
            System.out.println(newString);
            return;
        }
        char current_character = s.charAt(indx);
        if (map[current_character-'a']) {
            removeDuplicates(s, indx+1,newString);
        } else {
            newString += current_character;
            map[current_character-'a'] = true;
            removeDuplicates(s, indx+1, newString);
        }

    }
    public static void main(String[] args) {
        String s = "addcc";
        removeDuplicates(s, 0, "");
        int c = 'a';
        System.out.println(c);
    }
}
