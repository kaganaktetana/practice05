package semester1.practice05;

public class Task_15 {
        public static void main(String[] args) {
            double[] prices = {42.5, 41.8, 44.1, 40.9, 43.6, 45.0};

            double min = prices[0];
            double max = prices[0];

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < min) {
                    min = prices[i];
                }

                if (prices[i] > max) {
                    max = prices[i];
                }
            }

            double range = max - min;

            System.out.printf("Розмах цін: %.2f%n", range);
        }
    }
