package semester1.practice05;

public class Task_26 {
        public static void main(String[] args) {
            int[][] randomGrid = new int[4][3];

            for (int i = 0; i < randomGrid.length; i++) {
                for (int j = 0; j < randomGrid[i].length; j++) {
                    randomGrid[i][j] = (int) (Math.random() * 90) + 10;
                }
            }

            System.out.println("Матриця через deepToString:");
            System.out.println(java.util.Arrays.deepToString(randomGrid));

            System.out.println("Матриця у вигляді таблиці:");
            for (int i = 0; i < randomGrid.length; i++) {
                for (int j = 0; j < randomGrid[i].length; j++) {
                    System.out.print(randomGrid[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }