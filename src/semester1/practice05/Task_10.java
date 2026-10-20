package semester1.practice05;

public class Task_10 {
        public static void main(String[] args) {
            int[] data = {12, -5, 0, 43, -19, 0, -2, 8, 0, 15};

            int positive = 0;
            int negative = 0;
            int zeros = 0;

            for (int i = 0; i < data.length; i++) {
                if (data[i] > 0) {
                    positive++;
                } else if (data[i] < 0) {
                    negative++;
                } else {
                    zeros++;
                }
            }

            System.out.println("Додатних чисел: " + positive);
            System.out.println("Від'ємних чисел: " + negative);
            System.out.println("Нулів: " + zeros);
        }
    }