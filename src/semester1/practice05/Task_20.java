package semester1.practice05;

public class Task_20 {
        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10};

            boolean isSorted = true;

            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;
                    break;
                }
            }

            if (isSorted) {
                System.out.println("Масив відсортований за зростанням.");
            } else {
                System.out.println("Масив не відсортований за зростанням.");
            }
        }
    }