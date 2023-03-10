package Urok3.Lekciq3;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine(); //Sofia, Varna, Plovdiv
        double quantity = Double.parseDouble(scanner.nextLine());


        double price = 0; //единична цена

        //проверка за градовете
        if ("Sofia".equals(town)) { //проверка за продукт -> coffee    water   beer    sweets  peanuts
            if (product.equals("coffee")) {
                price = 0.50;
            } else if (product.equals("water")) {
                price = 0.80;
            } else if (product.equals("beer")) {
                price = 1.20;
            } else if (product.equals("sweets")) {
                price = 1.45;
            } else if (product.equals("peanuts")) {
                price = 1.60;
            }
        } else if ("Varna".equals(town)) { //проверка за продукт -> coffee    water   beer    sweets  peanuts
            if (product.equals("coffee")) {
                price = 0.45;
            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.10;
            } else if (product.equals("sweets")) {
                price = 1.35;
            } else if (product.equals("peanuts")) {
                price = 1.55;
            }
        } else if ("Plovdiv".equals(town)) { //проверка за продукт -> coffee    water   beer    sweets  peanuts
            if (product.equals("coffee")) {
                price = 0.40;
            } else if (product.equals("water")) {
                price = 0.70;
            } else if (product.equals("beer")) {
                price = 1.15;
            } else if (product.equals("sweets")) {
                price = 1.30;
            } else if (product.equals("peanuts")) {
                price = 1.50;
            }
        }

        //единичната цена за закупения продукт
        //крайна цена = количество * ед. цена (град и продукт)
        double totalPrice = quantity * price;
        System.out.println(totalPrice);


    }
}
