package semester1.practice05.homework;

import java.util.Scanner;

public class robloks {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] petNames = {
                    "Dog", "Cat", "Dragon", "Unicorn", "Huge Titanic Cat"
            };

            int[] petPowers = {15, 25, 120, 350, 2000};
            int[] dropChances = {45, 30, 15, 8, 2};

            String[] inventoryNames = new String[8];
            int[] inventoryPowers = new int[8];

            int balance = 300;
            int petCount = 0;
            int eggPrice = 100;
            int choice;

            System.out.println("======================================================");
            System.out.println("           ROBLOX: PET SIMULATOR");
            System.out.println("======================================================");

            do {
                System.out.println();
                System.out.println("Баланс: " + balance + " монет | Вихованців у рюкзаку: "
                        + petCount + "/" + inventoryNames.length);
                System.out.println();
                System.out.println("1 - Відкрити чарівне яйце (100 монет)");
                System.out.println("2 - Відкрити рюкзак-інвентар");
                System.out.println("3 - Порахувати силу команди");
                System.out.println("4 - Фармити монети (+50..150 монет)");
                System.out.println("0 - Вийти з гри");
                System.out.print("Ваш вибір: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        if (balance < eggPrice) {
                            System.out.println("Недостатньо монет для відкриття яйця!");
                        } else if (petCount >= inventoryNames.length) {
                            System.out.println(
                                    "Рюкзак переповнений! Продайте або видаліть зайвих петів."
                            );
                        } else {
                            balance -= eggPrice;

                            int roll = (int) (Math.random() * 100) + 1;
                            int cumulativeChance = 0;
                            int petIndex = petNames.length - 1;

                            for (int i = 0; i < dropChances.length; i++) {
                                cumulativeChance += dropChances[i];

                                if (roll <= cumulativeChance) {
                                    petIndex = i;
                                    break;
                                }
                            }

                            System.out.println();
                            System.out.println("Яйце розколюється...");

                            if (petIndex == 4) {
                                System.out.println(
                                        "НЕЙМОВІРНО! СУПЕР-ДЖЕКПОТ!"
                                );
                            }

                            System.out.println(
                                    "ВАМ ВИПАВ: " + petNames[petIndex]
                                            + "! (Сила: " + petPowers[petIndex] + ")"
                            );

                            inventoryNames[petCount] = petNames[petIndex];
                            inventoryPowers[petCount] = petPowers[petIndex];
                            petCount++;

                            System.out.println("Вихованця додано в інвентар!");
                            System.out.println("Залишок монет: " + balance);
                        }
                        break;

                    case 2:
                        System.out.println();
                        System.out.println("--- ВАШ РЮКЗАК ---");

                        if (petCount == 0) {
                            System.out.println("Рюкзак порожній.");
                        } else {
                            for (int i = 0; i < petCount; i++) {
                                System.out.println(
                                        "[Слот " + (i + 1) + "] "
                                                + inventoryNames[i]
                                                + " (Сила: " + inventoryPowers[i] + ")"
                                );
                            }
                        }
                        break;
                    case 3:
                        System.out.println();
                        System.out.println("--- СТАТИСТИКА ВАШОЇ КОМАНДИ ---");

                        int totalPower = 0;
                        int bestPetIndex = -1;

                        for (int i = 0; i < petCount; i++) {
                            totalPower += inventoryPowers[i];

                            if (bestPetIndex == -1
                                    || inventoryPowers[i] > inventoryPowers[bestPetIndex]) {
                                bestPetIndex = i;
                            }
                        }

                        System.out.println("Кількість вихованців: " + petCount + " шт.");
                        System.out.println("Загальна сила команди: "
                                + totalPower + " очок шкоди");

                        if (bestPetIndex == -1) {
                            System.out.println("У вас ще немає вихованців.");
                        } else {
                            System.out.println(
                                    "Найсильніший улюбленець: "
                                            + inventoryNames[bestPetIndex]
                                            + " (Сила: " + inventoryPowers[bestPetIndex] + ")"
                            );
                        }
                        break;

                    case 4:
                        int earnedCoins = (int) (Math.random() * 101) + 50;
                        balance += earnedCoins;

                        System.out.println("Ви розбили купу монет!");
                        System.out.println("Зароблено: " + earnedCoins + " монет.");
                        System.out.println("Поточний баланс: " + balance + " монет.");
                        break;

                    case 0:
                        System.out.println("Дякуємо за гру! До зустрічі!");
                        break;

                    default:
                        System.out.println("Невідома команда. Спробуйте ще раз.");
                }

            } while (choice != 0);

            scanner.close();
        }
    }
