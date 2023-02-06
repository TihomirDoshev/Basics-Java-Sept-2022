package Urok1.Lekciq1;

import java.util.Scanner;

public class InchToSm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54 ;
        System.out.println(centimeters);

    }
}
