package Urok1.Upr1;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int folio = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int fluid = Integer.parseInt(scanner.nextLine());
        int neededTime = Integer.parseInt(scanner.nextLine());
        double priceFolio = (folio + 2) * 1.50;
        double pricePaint = (paint +(paint*10/100.0)) * 14.50;
        double priceFluid = fluid * 5.00;
        double priceBags = 0.40;
        double allPrice = priceFolio + pricePaint + priceFluid + priceBags;
        double priceForMens = (allPrice * (30/100.0)) * neededTime;
        double finalPrice = allPrice + priceForMens;
        System.out.println(finalPrice);

    }
}
