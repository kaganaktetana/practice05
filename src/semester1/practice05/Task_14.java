package semester1.practice05;

public class Task_14 {
        public static void main(String[] args) {
            int[] salaries = {18000, 25000, 32000, 15000, 41000, 29000};

            int sum = 0;

            for (int i = 0; i < salaries.length; i++) {
                sum += salaries[i];
            }

            double average = (double) sum / salaries.length;

            System.out.println("Середня зарплата: " + average);
            System.out.println("Зарплати, більші за середню:");

            for (int i = 0; i < salaries.length; i++) {
                if (salaries[i] > average) {
                    System.out.println(salaries[i]);
                }
            }
        }
}

