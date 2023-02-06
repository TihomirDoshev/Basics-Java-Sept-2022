package Urok3.Upr3;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int countFlower = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0;


        switch (flower) {
            case "Roses":
                price = countFlower * 5;
                if (countFlower >80){
                    price = price - price *0.1;
                }
                break;
            case "Dahlias":
                price = countFlower *3.80;
                if (countFlower >90){
                    price = price - price*0.15;
                }
                break;
            case "Tulips":
                price = countFlower * 2.80;
                if (countFlower >80){
                    price = price - price * 0.15;
                }
                break;
            case "Narcissus":
                price =countFlower * 3;
                if (countFlower < 120){
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = countFlower * 2.50;
                if (countFlower < 80){
                    price = price + price * 0.2;
                }
                break;

        }
        double difference = Math.abs(budget - price);
        if (budget >= price){
            System.out.printf("Hey, you have a great garden with %d " +
                    "%s and %.2f leva left.",countFlower,flower,difference);
        }else if (budget < price){
            System.out.printf("Not enough money, you need %.2f leva more.",difference);
        }




    }
}









