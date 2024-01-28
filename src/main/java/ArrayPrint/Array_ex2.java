package ArrayPrint;

//              Write a program that displays the sum, product and
//              average of the elements of an integer array.

import java.util.Arrays;
import java.util.Scanner;

public class Array_ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size (max 20): ");
        int num = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int product = 1;
        double average = 0;

        while (num < 1 || num >= 20) {
            System.out.print("Invalid array size. Try again: ");
            num = scanner.nextInt();
        }

        int[] intArray = new int[num];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
            sum += intArray[i];
            product *= intArray[i];
        }

        average = sum / intArray.length;


        System.out.println(Arrays.toString(intArray));
        System.out.printf("Sum: %.2f %nProduct: %d %nAverage: %.2f%n", sum, product, average);

    }


}
