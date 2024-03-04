package ArrayPrint;

import java.awt.*;
import java.util.Arrays;

public class ArraysSorting {
    public static void main(String[] args) {

        int[] numbers = {12, 19, 3, 94, 58, 35, 77, 86};
        Arrays.sort(numbers);
        PrintArray_Integers printArray = new PrintArray_Integers(numbers);

        char[] letters = {'A', 'S', 'B', 'W', 'X', 'D', 'P', 'C'};
        Arrays.sort(letters);
        PrintArray_Character print = new PrintArray_Character(letters);

        int[] unicodes = {'c', 'z', 'b', 'a', 'A', 'Z', 'D', 'C'};
        Arrays.sort(unicodes);
        new PrintArray_Integers(unicodes);

        int[] numbers1 = {5, 4, 3, 2, 1, 0, -1};
        Arrays.sort(numbers1, 3, 7);
        new PrintArray_Integers(numbers1);

        String[] strings = {"hij", "abc", "efg"};
        Arrays.sort(strings);
        new PrintArray_Strings(strings);

        Point[] points = {new Point(1, 2), new Point(3, 4), new Point(-1, -2)};
        Arrays.sort(points);
        new PrintArray_Points(points);
    }
}