package semester1.practice05;

public class Task_38 {
        public static void main(String[] args) {
            int[][] pascal = new int[5][];

            for (int i = 0; i < pascal.length; i++) {
                pascal[i] = new int[i + 1];

                for (int j = 0; j < pascal[i].length; j++) {
                    if (j == 0 || j == i) {
                        pascal[i][j] = 1;
                    } else {
                        pascal[i][j] =
                                pascal[i - 1][j - 1] + pascal[i - 1][j];
                    }
                }
            }

            for (int i = 0; i < pascal.length; i++) {
                for (int j = 0; j < pascal[i].length; j++) {
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }
        }
    }