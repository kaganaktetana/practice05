package semester1.practice05;

public class Task_27 {
        public static void main(String[] args) {
            int[][] multTable = new int[9][9];

            for (int i = 0; i < multTable.length; i++) {
                for (int j = 0; j < multTable[i].length; j++) {
                    multTable[i][j] = (i + 1) * (j + 1);
                }
            }

            for (int i = 0; i < multTable.length; i++) {
                for (int j = 0; j < multTable[i].length; j++) {
                    System.out.printf("%4d", multTable[i][j]);
                }
                System.out.println();
            }
        }
    }