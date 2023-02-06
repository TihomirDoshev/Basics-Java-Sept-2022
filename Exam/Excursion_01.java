package Exam;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPeople = Integer.parseInt(scanner.nextLine());
        int numNight = Integer.parseInt(scanner.nextLine());
        int numCards = Integer.parseInt(scanner.nextLine());
        int numTickets = Integer.parseInt(scanner.nextLine());

        double nights = numNight * 20;
        double cards = numCards * 1.60;
        double tickets = numTickets * 6;
        double sumForOne = nights + cards + tickets;
        double sumForGroup = sumForOne * numPeople;
        double finalSum = sumForGroup + sumForGroup * 0.25;

        System.out.printf("%.2f",finalSum);

    }
}
