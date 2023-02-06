package Urok1.Upr1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int priceForOneYear = Integer.parseInt(scanner.nextLine());
        double snickers = priceForOneYear - (priceForOneYear*(40/100.0));
        double equip = snickers - (snickers*(20/100.0));
        double ball = equip / 4;
        double accessories = ball / 5;
        double finalPrice = priceForOneYear + snickers + equip + ball + accessories ;
        System.out.println(finalPrice);



    }
}
