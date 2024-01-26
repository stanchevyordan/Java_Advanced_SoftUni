package Stacks_And_Queues.Additional_Arrays.ArrayPrint;

import java.awt.*;

public class PrintArray_Points {
    public PrintArray_Points(Point[] points) {
        for (int j = 0; j < points.length; j++) {
            System.out.print(points[j] + " ");
        }
        System.out.println();
    }
}
