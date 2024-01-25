package Stacks_And_Queues.Additional_Arrays.ArrayPrint;

public class VariableLengthArgument {
    public static void main(String[] args) {

        int[] numbers = {1, 7, -2};

        System.out.println( sum(numbers) );

    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
        }
        return sum;
    }
}
