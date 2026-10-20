package semester1.practice05;

public class Task_13 {
        public static void main(String[] args) {
            java.util.Scanner scan = new java.util.Scanner(System.in);

            int[] rolls = {3, 6, 2, 6, 1, 4, 6, 5, 2, 6};

            System.out.print("Введіть число від 1 до 6: ");
            int target = scan.nextInt();

            if (target >= 1 && target <= 6) {
                int count = 0;

                for (int i = 0; i < rolls.length; i++) {
                    if (rolls[i] == target) {
                        count++;
                    }
                }

                System.out.println("Число " + target + " випало " + count + " раз(и).");
            } else {
                System.out.println("Потрібно ввести число від 1 до 6.");
            }

            scan.close();
        }
    }