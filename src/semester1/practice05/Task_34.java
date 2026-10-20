package semester1.practice05;

public class Task_34 {
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int mainDiagonalSum = 0;
            int secondaryDiagonalSum = 0;

            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    if (row == col) {
                        mainDiagonalSum += matrix[row][col];
                    }

                    if (row + col == matrix.length - 1) {
                        secondaryDiagonalSum += matrix[row][col];
                    }
                }
            }

            System.out.println("Сума головної діагоналі: " + mainDiagonalSum);
            System.out.println("Сума побічної діагоналі: " + secondaryDiagonalSum);

            if (mainDiagonalSum > secondaryDiagonalSum) {
                System.out.println("Головна діагональ має більшу суму.");
            } else if (mainDiagonalSum < secondaryDiagonalSum) {
                System.out.println("Побічна діагональ має більшу суму.");
            } else {
                System.out.println("Суми діагоналей рівні.");
            }
        }
    }
