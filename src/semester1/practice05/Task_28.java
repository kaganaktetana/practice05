package semester1.practice05;

public class Task_28 {
        public static void main(String[] args) {
            int[][] matrix = new int[5][5];

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (row == col) {
                        matrix[row][col] = 1;
                    } else {
                        matrix[row][col] = 0;
                    }
                }
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
