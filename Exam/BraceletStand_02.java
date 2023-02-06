package Exam;

import java.util.Scanner;

public class BraceletStand_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyForDay = Double.parseDouble(scanner.nextLine());
        double tradeMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double expenseForAllPeriod = Double.parseDouble(scanner.nextLine());
        double priceForGift = Double.parseDouble(scanner.nextLine());

        double savedMoney = (moneyForDay * 5) + (tradeMoneyPerDay * 5);
        double finalMoney = savedMoney - expenseForAllPeriod;

        if (finalMoney >= priceForGift) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", finalMoney);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", priceForGift - finalMoney);
        }
    }
}

