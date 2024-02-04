package ArrayPrint;

import java.util.Scanner;

public class Array_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int[] arrayName = new int[number];

        for (int i = 0; i < number; i++) {
            arrayName[i] = Integer.parseInt(scanner.nextLine());
        }

        PrintArray_Integers printArray = new PrintArray_Integers(arrayName);
    }
}
