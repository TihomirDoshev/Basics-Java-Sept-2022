package Urok3.Upr3;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius = Integer.parseInt(scanner.nextLine());
        String  dayTime = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (celsius >= 10 && celsius <= 18){
            if (dayTime.equals("Morning")){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if (dayTime.equals("Afternoon")){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (dayTime.equals("Evening")){
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }else if (celsius >18 && celsius <= 24){
            if (dayTime.equals("Morning")){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (dayTime.equals("Afternoon")){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if (dayTime.equals("Evening")){
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }else if (celsius >= 25){
            if (dayTime.equals("Morning")){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if (dayTime.equals("Afternoon")){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }else if (dayTime.equals("Evening")){
                outfit = "Shirt";
                shoes = "Moccasins";
            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.",celsius,outfit,shoes);
    }
}
