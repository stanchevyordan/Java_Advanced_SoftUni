package ArrayPrint;

import java.util.Arrays;

public class ArraysSearching {
    public static void main(String[] args) {

        int[] numbers = {5, 4, 3, 2, 1, 0, -1, -2};
        Arrays.sort(numbers);
        new PrintArray_Integers(numbers);
        System.out.println(Arrays.binarySearch(numbers, 4));        // it prints the indexes of the numbers
        System.out.println(Arrays.binarySearch(numbers, 5));        // we are searching for
    }
}
