package semester1.practice05;

public class Task_04 {

        public static void main(String[] args) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);

            System.out.print("Введіть N: ");
            int N = scanner.nextInt();

            if (N > 0) {
                int[] arr = new int[N];

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i + 1;
                }

                System.out.println(java.util.Arrays.toString(arr));
            } else {
                System.out.println("N має бути більшим за 0.");
            }

            scanner.close();
        }
    }