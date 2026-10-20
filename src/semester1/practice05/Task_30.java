package semester1.practice05;

public class Task_30 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int sum = 0;
            int count = 0;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    count++;
                }
            }

            double average = (double) sum / count;

            System.out.println("Сума елементів: " + sum);
            System.out.println("Кількість елементів: " + count);
            System.out.println("Середнє значення: " + average);
        }
    }