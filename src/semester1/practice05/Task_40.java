package semester1.practice05;

public class Task_40 {
        public static void main(String[] args) {
            String[] cities = {"Київ", "Львів", "Одеса"};

            double[][][] weather = {
                    {
                            {15, 8}, {17, 9}, {18, 10}, {16, 7},
                            {19, 11}, {20, 12}, {18, 9}
                    },
                    {
                            {12, 5}, {14, 6}, {15, 7}, {13, 4},
                            {16, 8}, {17, 9}, {14, 6}
                    },
                    {
                            {20, 13}, {22, 14}, {23, 15}, {21, 12},
                            {24, 16}, {25, 17}, {22, 14}
                    }
            };

            for (int city = 0; city < weather.length; city++) {
                double sumDay = 0;

                for (int day = 0; day < weather[city].length; day++) {
                    sumDay += weather[city][day][0];
                }

                double averageDay = sumDay / weather[city].length;

                System.out.printf(
                        "Середня денна температура в місті %s: %.2f °C%n",
                        cities[city], averageDay
                );
            }

            double coldestNight = weather[0][0][1];
            int coldestCity = 0;
            int coldestDay = 0;

            for (int city = 0; city < weather.length; city++) {
                for (int day = 0; day < weather[city].length; day++) {
                    double nightTemperature = weather[city][day][1];

                    if (nightTemperature < coldestNight) {
                        coldestNight = nightTemperature;
                        coldestCity = city;
                        coldestDay = day;
                    }
                }
            }

            String[] days = {
                    "Понеділок", "Вівторок", "Середа", "Четвер",
                    "П'ятниця", "Субота", "Неділя"
            };

            System.out.printf(
                    "Найхолодніша ніч: %.1f °C, місто %s, день — %s.%n",
                    coldestNight, cities[coldestCity], days[coldestDay]
            );
        }
    }

