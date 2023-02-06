package Urok2.Upr2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForVacation = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countToy = Integer.parseInt(scanner.nextLine());
        int countBear = Integer.parseInt(scanner.nextLine());
        int countMinion = Integer.parseInt(scanner.nextLine());
        int countTrucks = Integer.parseInt(scanner.nextLine());

        double priceForPuzzles = countPuzzles * 2.60;
        double priceForToys = countToy * 3;
        double priceForBears = countBear * 4.10;
        double priceForMinions = countMinion * 8.20;
        double priceForTrucks = countTrucks * 2;

        int totalCounts = countBear + countMinion + countTrucks + countToy + countPuzzles;
        double totalPrise = priceForPuzzles + priceForToys + priceForBears + priceForMinions + priceForTrucks;
        double discount;
        if (totalCounts >= 50) {
            discount = totalPrise * 0.25;


        }else{
            discount = 0;

        }
        double finalSum = totalPrise-discount;
        double rent = finalSum *0.10;
        double totalSum = finalSum - rent;

        if (totalSum>=priceForVacation){
            System.out.printf("Yes! %.2f lv left.",totalSum - priceForVacation);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(totalSum - priceForVacation));
        }



    }

}





