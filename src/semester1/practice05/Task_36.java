package semester1.practice05;

public class Task_36 {
        public static void main(String[] args) {
            int[][] ladder = new int[4][];

            for (int i = 0; i < ladder.length; i++) {
                ladder[i] = new int[i + 1];

                for (int j = 0; j < ladder[i].length; j++) {
                    ladder[i][j] = i;
                }
            }

            for (int i = 0; i < ladder.length; i++) {
                for (int j = 0; j < ladder[i].length; j++) {
                    System.out.print(ladder[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
