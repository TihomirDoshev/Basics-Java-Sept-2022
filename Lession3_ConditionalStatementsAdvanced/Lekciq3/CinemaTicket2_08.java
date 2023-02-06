package Urok3.Lekciq3;

import java.util.Scanner;

public class CinemaTicket2_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfWeek = scanner.nextLine();
        //Monday or Tuesday or Friday -> 12
        //Wednesday or Thursday -> 14
        //Saturday or Sunday -> 16
        if (dayOfWeek.equals("Monday") || dayOfWeek.equals("Tuesday") || dayOfWeek.equals("Friday")) {
            System.out.println(12);
        } else if (dayOfWeek.equals("Wednesday") || dayOfWeek.equals("Thursday")) {
            System.out.println(14);
        } else if (dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println(16);
        }

    }
}

