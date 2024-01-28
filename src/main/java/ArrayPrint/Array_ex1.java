package ArrayPrint;

import java.util.Scanner;

//      Write a program that fills an array with n integers entered by the user.
//      Suppose that the user can enter at least 1 number and at most 20 numbers.

public class Array_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements you want to enter? (max is 20): ");

        int numbers = Integer.parseInt(scanner.nextLine());

        while(numbers <= 0 || numbers > 20) {
            System.out.print("Invalid number. Try again: ");
            numbers = scanner.nextInt();
        }

        int[] arrayNumbers = new int[numbers];

        for (int i = 0; i < arrayNumbers.length; i++) {         // filling the array with integers
            arrayNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrayNumbers.length; i++) {         // printing the array
            System.out.print(arrayNumbers[i] + " ");
        }
    }
}
