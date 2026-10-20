package semester1.practice05;

public class Task_11 {
        public static void main(String[] args) {
            int[] numbers = {12, 7, 4, 9, 16, 3, 10, 5, 8, 11};

            int evenCount = 0;
            int oddSum = 0;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddSum += numbers[i];
                }
            }

            System.out.println("Кількість парних чисел: " + evenCount);
            System.out.println("Сума непарних чисел: " + oddSum);
        }
    }
