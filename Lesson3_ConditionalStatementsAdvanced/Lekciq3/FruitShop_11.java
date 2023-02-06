package Urok3.Lekciq3;

import java.util.Scanner;

public class FruitShop_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quality = Double.parseDouble(scanner.nextLine());
        double sum = 0.00;
        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                sum = quality * 2.50;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("apple")) {
                sum = quality * 1.20;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("orange")) {
                sum = quality * 0.85;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("grapefruit")) {
                sum = quality * 1.45;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("kiwi")) {
                sum = quality * 2.70;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("pineapple")) {
                sum = quality * 5.50;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("grapes")) {
                sum = quality * 3.85;
                System.out.printf("%.2f", sum);

            } else {
                System.out.println("error");
            }

        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                sum = quality * 2.70;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("apple")) {
                sum = quality * 1.25;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("orange")) {
                sum = quality * 0.90;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("grapefruit")) {
                sum = quality * 1.60;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("kiwi")) {
                sum = quality * 3.00;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("pineapple")) {
                sum = quality * 5.60;
                System.out.printf("%.2f", sum);

            } else if (fruit.equals("grapes")) {
                sum = quality * 4.20;
                System.out.printf("%.2f", sum);

            } else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
