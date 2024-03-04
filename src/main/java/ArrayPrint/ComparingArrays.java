package ArrayPrint;

import java.awt.*;
import java.util.Arrays;

public class ComparingArrays {
    public static void main(String[] args) {
        int[] numbers1 = {5, 4, 3, 2, 1, 0, -1};
        int[] numbers2 = {5, 4, 3, 2, 1, 0, -1};
        int[] numbers3 = {1, 2, 7, 7, 8, 3, 1};

        System.out.printf("Is it true that %s and %s arrays are equal? %n", Arrays.toString(numbers1), Arrays.toString(numbers2));
        System.out.println(Arrays.equals(numbers1, numbers2));

        Arrays.sort(numbers3);
        new PrintArray_Integers(numbers3);


        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 2);
        boolean isItTrue = point1.equals(point2);
        System.out.printf("Is it true that point 1 is equal to point 2?: %b%n", isItTrue);


    }
}
