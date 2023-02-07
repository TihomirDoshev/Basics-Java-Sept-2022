package Urok1.Upr1;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int str = Integer.parseInt(scanner.nextLine());
        int strForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int allHours = str / strForHour;
        int hoursPerDay = allHours / days;
        System.out.println(hoursPerDay);


    }
}
