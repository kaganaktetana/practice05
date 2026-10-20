package semester1.practice05;

public class Task_12 {
        public static void main(String[] args) {
            java.util.Scanner scan = new java.util.Scanner(System.in);

            int[] students = {1042, 2031, 3055, 4018, 5099};

            System.out.print("Введіть номер залікової книжки: ");
            int target = scan.nextInt();

            int foundIndex = -1;

            for (int i = 0; i < students.length; i++) {
                if (students[i] == target) {
                    foundIndex = i;
                    break;
                }
            }

            if (foundIndex != -1) {
                System.out.println("Студента знайдено. Індекс: " + foundIndex);
                System.out.println("Позиція: " + (foundIndex + 1));
            } else {
                System.out.println("Студента з таким номером не знайдено");
            }

            scan.close();
        }
    }
