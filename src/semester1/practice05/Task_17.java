package semester1.practice05;

public class Task_17 {
        public static void main(String[] args) {
            double[] salaries = {20000.0, 25000.0, 18000.0, 30000.0};

            for (int i = 0; i < salaries.length; i++) {
                salaries[i] *= 1.10;
            }

            System.out.println(java.util.Arrays.toString(salaries));
        }
    }