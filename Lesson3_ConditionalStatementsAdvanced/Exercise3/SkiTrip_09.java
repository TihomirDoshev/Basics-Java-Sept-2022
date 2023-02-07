package Urok3.Upr3;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();
        double price = 0;
        double total = 0;

        //        Price * days - 1 трябва да бъде price * (days - 1).
        switch (roomType) {
            case "room for one person":
                price = 18;
                total = price * (days - 1);
                break;
            case "apartment":
                price = 25;
                total = price * (days - 1);
                if (days < 10) {
                    total = total - total * 0.3;
                } else if (days > 10 && days <= 15) {
                    total = total - total * 0.35;
                } else {
                    total = total - total * 0.5;
                }
                break;
            case "president apartment":
                price = 35;
                total = price * (days - 1);
                if (days < 10) {
                    total = total - total * 0.1;
                } else if (days > 10 && days <= 15) {
                    total = total - total * 0.15;
                } else {
                    total = total - total * 0.2;
                }
                break;
        }
        if (feedback.equals("positive" )){
            total=total + total*0.25;
        }else {
            total= total - total * 0.1;

        }
        System.out.printf("%.2f ", total);
    }
}

