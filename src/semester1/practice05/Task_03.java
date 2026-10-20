package semester1.practice05;

public class Task_03 {
        public static void main(String[] args) {
            double[] prices = {120.50, 45.00, 890.99, 15.30, 420.00};

            System.out.println("Початкові ціни: " + java.util.Arrays.toString(prices));

            prices[2] = prices[2] * 0.8;

            System.out.println("Ціни після знижки: " + java.util.Arrays.toString(prices));
        }
    }

