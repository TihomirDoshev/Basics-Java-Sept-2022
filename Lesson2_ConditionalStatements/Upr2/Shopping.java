package Urok2.Upr2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int countVideo = Integer.parseInt(scanner.nextLine());
        int countProcessors = Integer.parseInt(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());

        double priceForVideo = countVideo * 250.0;
        double newPriceForVideo = priceForVideo;
        double priceForProcessors = priceForVideo * 0.35;
        double newPriceForProcessors = countProcessors * priceForProcessors;
        double priceForRam = priceForVideo * 0.1;
        double newPriceForRam = countRam * priceForRam;
        double sum = newPriceForVideo + newPriceForProcessors + newPriceForRam;
        double sumWithDiscount =0;

        if (countVideo>countProcessors){
            sumWithDiscount = sum - sum *0.15;

        }else{
            sumWithDiscount = sum;

        }
        if (budget>=sumWithDiscount){
            System.out.printf("You have %.2f leva left!",budget - sumWithDiscount);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",Math.abs(budget - sumWithDiscount));
        }
    }
}

