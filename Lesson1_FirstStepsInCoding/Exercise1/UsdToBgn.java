package Urok1.Upr1;

import java.util.Scanner;

public class UsdToBgn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double usd = Double.parseDouble(scanner.nextLine());

        Double bgn = usd * 1.79549;

        System.out.println(bgn);

    }
}
