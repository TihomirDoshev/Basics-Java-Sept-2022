package Urok5.Upr5;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int daysOfSpending = 0;
        int daysCounter = 0;

        while(vacationMoney > money){

            String operation = scanner.nextLine();
            double moneyLaundering = Double.parseDouble(scanner.nextLine());
            daysCounter++;

            if(operation.equals("spend")){
                money -= moneyLaundering;
                daysOfSpending++;

                if(money < 0){
                    money = 0;
                }

                if(daysOfSpending >= 5){
                    System.out.println("You can't save the money.");
                    System.out.printf("%d", daysCounter);
                    break;
                }

            }else if(operation.equals("save")){
                money += moneyLaundering;
                daysOfSpending = 0;
            }
        }

        int allDays = daysCounter + daysOfSpending;

        if(money >= vacationMoney){
            System.out.printf("You saved the money for %d days.", allDays);
        }







    }
}
