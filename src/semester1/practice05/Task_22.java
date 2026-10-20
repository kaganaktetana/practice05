package semester1.practice05;

public class Task_22 {
        public static void main(String[] args) {
            int[] test = {45, 12, 89, 3, 27};

            System.out.println("Початковий масив: " + java.util.Arrays.toString(test));

            java.util.Arrays.sort(test);
            System.out.println("Відсортований масив: " + java.util.Arrays.toString(test));

            java.util.Arrays.fill(test, -1);
            System.out.println("Заповнений масив: " + java.util.Arrays.toString(test));
        }
    }
