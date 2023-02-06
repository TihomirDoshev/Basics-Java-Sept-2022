package Urok2.Upr2;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double dressForOne = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;
        double discountFofDress;


        if (statists>150){
            discountFofDress = dressForOne * 0.1;

        }else{
            discountFofDress = 0;

        }

        double sum = decor + (dressForOne-discountFofDress)*statists;

        if (sum > budget){
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",sum - budget);
        }else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget-sum);
        }

    }
}


