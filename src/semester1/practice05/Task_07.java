package semester1.practice05;

public class Task_07 {
        public static void main(String[] args) {
            int[] original = {3, 7, 1, 9, 4};
            int[] copy = new int[original.length];

            for (int i = 0; i < original.length; i++) {
                copy[i] = original[i];
            }

            copy[0] = 999;

            System.out.println("Оригінал: " + java.util.Arrays.toString(original));
            System.out.println("Копія: " + java.util.Arrays.toString(copy));
        }
    }
