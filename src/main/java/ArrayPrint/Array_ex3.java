package ArrayPrint;

import java.util.Scanner;

public class Array_ex3 {
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

        System.out.print("Enter the searched element: ");
        int searchedElement = scanner.nextInt();
        System.out.println(SearchedElement(arrayNumbers, searchedElement));

    }

    public static int SearchedElement(int[] arrayNumbers, int searchedElement) {
        int repeated = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (searchedElement == arrayNumbers[i]) {
                repeated++;
            }
        }
        return repeated;
    }
}
