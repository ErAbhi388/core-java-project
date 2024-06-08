package sorting;//Java Program to Shift the 0's in an Array to the Beginning

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShiftZeroesBeginning {
    // Function to shift 0's in the beginning
    static void inTheBeginning(int[] array){
        int startIndex=0;
        int i,temp,j;
        for(i=1; i<array.length; i++){
            if(array[i] == 0){
                for(j=i; j>startIndex;j--){
                    array[j] = array[j-1] + array[j]  - (array[j-1]=array[j]);
                }
                startIndex++;
            }
        }
    }
    // Function to read input and display the final array
    public static void main(String[] args){
        int[] array = {1,0,8,9,0,45,10};
        int i;
        inTheBeginning(array);
        System.out.println("The array after shifting the" +
                " zeroes in the beginning is");
        for(i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}