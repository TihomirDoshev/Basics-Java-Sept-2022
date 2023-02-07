package Urok3.Upr3;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int countFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        double newSum = 0;


        switch (flowers) {
            case "Roses":
                if (countFlowers > 80) {
                    sum = countFlowers * 5;
                    newSum = sum - sum * 0.1;

                } else {
                    newSum = countFlowers * 5;
                }

                break;
            case "Dahlias":
                if (countFlowers > 90) {
                    sum = countFlowers * 3.8;
                    newSum = sum - sum * 0.15;

                } else {
                    newSum = countFlowers * 3.8;
                }

                break;
            case "Tulips":
                if (countFlowers > 80) {
                    sum = countFlowers * 2.8;
                    newSum = sum - sum * 0.15;

                } else {
                    newSum = countFlowers * 2.8;
                }

                break;
            case "Narcissus":
                if (countFlowers < 120) {
                    sum = countFlowers * 3;
                    newSum = sum + sum * 0.15;

                } else {
                    newSum = countFlowers * 3;
                }

                break;
            case "Gladiolus":
                if (countFlowers < 80) {
                    sum = countFlowers * 2.5;
                    newSum = sum + sum * 0.2;

                } else {
                    newSum = countFlowers * 2.5;

                    break;
                }

        }
        if (newSum <= budget) {
            System.out.printf("Hey, you have a great garden with " +
                    "%d %s and %.2f leva left.", countFlowers, flowers, budget - newSum);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", newSum - budget);
        }
    }
}



