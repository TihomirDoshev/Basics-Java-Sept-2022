package Urok3.Lekciq3;

import java.util.Scanner;

public class FruitShop2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double num = Double.parseDouble(scanner.nextLine());

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday")
                || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%2f", num * 2.5);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", num * 1.2);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", num * 0.85);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", num * 1.45);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", num * 2.7);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", num * 5.5);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", num * 3.85);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", num * 2.7);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", num * 1.25);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", num * 0.9);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", num * 1.6);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", num * 3);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", num * 5.6);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", num * 4.2);
            } else {
                System.out.println("error");

            }

        }
    }
}
