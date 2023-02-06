package Urok3.Upr3;

import java.util.Scanner;

public class SummerOutfit_02_My {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degree = Integer.parseInt(scanner.nextLine());
        String  time = scanner.nextLine();
        if (time.equals("Morning")){
            if (10 <=degree && degree <= 18){
                System.out.printf("It's %d degrees, get your Sweatshirt and Sneakers.",degree);
            }else if (18 < degree && degree <= 24){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",degree);

            }else if (degree >= 25){
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",degree);
            }
        }else if (time.equals("Afternoon")){
            if (10 <=degree && degree <= 18){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",degree);
            }else if (18 < degree && degree <= 24){
                System.out.printf("It's %d degrees, get your T-Shirt and Sandals.",degree);

            }else if (degree >= 25){
                System.out.printf("It's %d degrees, get your Swim Suit and Barefoot.",degree);
            }
        }else if (time.equals("Evening")){
            if (10 <=degree && degree <= 18){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",degree);
            }else if (18 < degree && degree <= 24){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",degree);

            }else if (degree >= 25){
                System.out.printf("It's %d degrees, get your Shirt and Moccasins.",degree);
            }
        }

    }
}
