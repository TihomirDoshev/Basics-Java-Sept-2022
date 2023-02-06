package Urok1.Upr1;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // Прочитане на входните данни
        Double deposit = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());
        //Пресмятаме стойността за месец
        double profitPerMonth = (deposit*(rate/100))/12;
        //Пресмятаме цялата съма за всички месеци
        double totalSum = deposit + profitPerMonth * mounts;
        //Принтиране на конзолата
        System.out.println(totalSum);


    }
}
