package ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class FillingArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers1 = new int[8];
        Arrays.fill(numbers1, 1);
        Arrays.fill(numbers1, 3, 5, 5);
        PrintArray_Integers print = new PrintArray_Integers(numbers1);

        String[] strings = new String[3];
        Arrays.fill(strings, "Plamen e pedal");
        new PrintArray_Strings(strings);

        for (int i = 0; i < numbers1.length; i++) {
            System.out.printf(numbers1[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(numbers1));
    }
}
