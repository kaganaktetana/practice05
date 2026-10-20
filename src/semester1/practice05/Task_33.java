package semester1.practice05;

public class Task_33 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {3, -7, 12, 4},
                    {-5, 20, 8, -2},
                    {11, 6, -9, 15}
            };

            int max = matrix[0][0];
            int maxRow = 0;
            int maxCol = 0;

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (matrix[row][col] > max) {
                        max = matrix[row][col];
                        maxRow = row;
                        maxCol = col;
                    }
                }
            }

            System.out.println(
                    "Максимум: " + max + " у комірці [" + maxRow + ", " + maxCol + "]"
            );
        }
    }