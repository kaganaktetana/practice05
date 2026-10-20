package semester1.practice05;

public class Task_31 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12}
            };

            int[] rowSums = new int[3];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    rowSums[i] += matrix[i][j];
                }
            }

            for (int i = 0; i < rowSums.length; i++) {
                System.out.println("Рядок " + i + ": сума = " + rowSums[i]);
            }
        }
    }