package Urok3.Lekciq3;

import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double sum = 0.00;
        if (town.equals("Sofia")) {
            // 0 ≤ s ≤ 500
            if (sales >= 0 && sales <= 500) {
                sum = sales * 0.05;
                System.out.printf("%.2f", sum);
                //500 < s ≤ 1 000
            } else if (sales > 500 && sales <= 1000) {
                sum = sales * 0.07;
                System.out.printf("%.2f", sum);
                //1 000 < s ≤ 10 000
            } else if (sales > 1000 && sales <= 10000) {
                sum = sales * 0.08;
                System.out.printf("%.2f", sum);
                //s > 10 000
            } else if (sales > 10000) {
                sum = sales * 0.12;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }

        } else if (town.equals("Varna")) {
            // 0 ≤ s ≤ 500
            if (sales >= 0 && sales <= 500) {
                sum = sales * 0.045;
                System.out.printf("%.2f", sum);
                //500 < s ≤ 1 000
            } else if (sales > 500 && sales <= 1000) {
                sum = sales * 0.075;
                System.out.printf("%.2f", sum);
                //1 000 < s ≤ 10 000
            } else if (sales > 1000 && sales <= 10000) {
                sum = sales * 0.1;
                System.out.printf("%.2f", sum);
                //s > 10 000
            } else if (sales > 10000) {
                sum = sales * 0.13;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        }else if (town.equals("Plovdiv")){
            // 0 ≤ s ≤ 500
            if (sales >= 0 && sales <= 500) {
                sum = sales * 0.055;
                System.out.printf("%.2f", sum);
                //500 < s ≤ 1 000
            } else if (sales > 500 && sales <= 1000) {
                sum = sales * 0.08;
                System.out.printf("%.2f", sum);
                //1 000 < s ≤ 10 000
            } else if (sales > 1000 && sales <= 10000) {
                sum = sales * 0.12;
                System.out.printf("%.2f", sum);
                //s > 10 000
            } else if (sales > 10000) {
                sum = sales * 0.145;
                System.out.printf("%.2f", sum);
            } else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
