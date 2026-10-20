package semester1.practice05;

public class Task_32 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[] colSums = new int[matrix[0].length];

            for (int col = 0; col < matrix[0].length; col++) {
                for (int row = 0; row < matrix.length; row++) {
                    colSums[col] += matrix[row][col];
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            for (int sum : colSums) {
                System.out.print(sum + "\t");
            }
            System.out.println();
        }
    }
