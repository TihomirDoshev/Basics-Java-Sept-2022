package Urok3.Upr3;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());
        double price = 0;
        //В зависимост от броя си групата ползва отстъпка:
//•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//•	Ако групата е от 12 нагоре  –  отстъпка от 25%.

        switch (season) {
            case "Spring":
                price = 3000;
                if (people % 2==0){
                    price =price- price * 0.05;
                }
                break;
            case "Summer":
                price = 4200;
                if (people % 2==0){
                    price = price - price * 0.05;
                }
                break;

            case "Autumn":
                price = 4200;


                break;

            case "Winter":
                price = 2600;
                if (people % 2==0){
                    price = price -price * 0.05;
                }

                break;


        }if (people<=6){
            price = price -price * 0.1;
        }else if (people>=7 && people<=11){
            price = price -price * 0.15;

        }else if (people>=12){
            price = price - price * 0.25;

        }
        double difference = Math.abs(budget - price);
        if (budget>=price){
            System.out.printf("Yes! You have %.2f leva left.",difference);

        }else {
            System.out.printf("Not enough money! You need %.2f leva.",difference);
        }

    }
}
