package semester1.practice05;

public class Task_01 {
        public static void main(String[] args) {
            int[] numbers = new int[5];

            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            numbers[0] = 10;
            numbers[2] = 30;
            numbers[4] = 50;

            System.out.println(java.util.Arrays.toString(numbers));
        }
    }

