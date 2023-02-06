package Urok1.Upr1;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int veganMenu = Integer.parseInt(scanner.nextLine());
        double priceChickenMenu = chickenMenu * 10.35;
        double priceFishMenu = fishMenu * 12.40;
        double priceVeganMenu = veganMenu * 8.15;
        double allPriceMenu = priceChickenMenu + priceFishMenu + priceVeganMenu;
        double priceDesert = allPriceMenu *(20/100.0);
        double delivery = 2.5;
        double allPriceDelivery = allPriceMenu + priceDesert + delivery;
        System.out.println(allPriceDelivery);

    }
}
