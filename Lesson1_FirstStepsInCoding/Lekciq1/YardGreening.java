package Urok1.Lekciq1;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double yards = Double.parseDouble(scanner.nextLine());
        double priceForYards = yards * 7.61;
        double discountForYards = priceForYards*(18/100.0);
        double finalPrice = priceForYards - discountForYards;
        System.out.printf("The final price is: %f lv.%n",finalPrice);
        System.out.printf("The discount is: %f lv.",discountForYards);



    }
}
