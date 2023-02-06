package Urok3.Lekciq3;

import java.util.Scanner;

public class SmallShop2_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  product = scanner.nextLine();
        String  city = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
//град /	coffee	water	beer	sweets	peanuts
//Sofia	     0.50	 0.80	1.20	1.45	1.60
//Plovdiv	 0.40	0.70	1.15	1.30	1.50
//Varna	     0.45	0.70	1.10	1.35	1.55

        if (city.equals("Sofia")){
            if (product.equals("coffee")){
                System.out.printf("%.2f",count * 0.50);
            }else if (product.equals("water")){
                System.out.printf("%.2f",count * 0.80);
            }else if (product.equals("beer")){
                System.out.printf("%.2f",count * 1.20);
            }else if (product.equals("sweets")){
                System.out.printf("%.2f",count * 1.45);
            }else if (product.equals("peanuts")){
                System.out.printf("%.2f",count * 1.60);
            }
        }else if (city.equals("Plovdiv")){
            if (product.equals("coffee")){
                System.out.printf("%.2f",count * 0.40);
            }else if (product.equals("water")){
                System.out.printf("%.2f",count * 0.70);
            }else if (product.equals("beer")){
                System.out.printf("%.2f",count * 1.15);
            }else if (product.equals("sweets")){
                System.out.printf("%.2f",count * 1.30);
            }else if (product.equals("peanuts")){
                System.out.printf("%.2f",count * 1.50);
            }

        }else if (city.equals("Varna")){
            if (product.equals("coffee")){
                System.out.printf("%.2f",count * 0.45);
            }else if (product.equals("water")){
                System.out.printf("%.2f",count * 0.70);
            }else if (product.equals("beer")){
                System.out.printf("%.2f",count * 1.10);
            }else if (product.equals("sweets")){
                System.out.printf("%.2f",count * 1.35);
            }else if (product.equals("peanuts")){
                System.out.printf("%.2f",count * 1.55);
            }

        }




    }
}
