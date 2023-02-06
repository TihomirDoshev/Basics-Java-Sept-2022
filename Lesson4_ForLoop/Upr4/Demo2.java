package Urok4.Upr4;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double sales =0;
        double count_of_rating = 0;


        for (int i = 1; i <=n ; i++) {
            int possibleRatingAndSales = Integer.parseInt(scanner.nextLine());

            int rating = possibleRatingAndSales % 10;
            int possible_sales = possibleRatingAndSales / 10;

            count_of_rating = count_of_rating + rating;


            if (rating == 2){
                sales +=  possible_sales *0.0;
            }else  if (rating == 3){
                sales +=  possible_sales *0.5;
            }else if (sales == 4){
                sales +=  possible_sales * 0.7;
            }else if (sales == 5){
                sales += possible_sales *0.85;
            }else if (sales == 6){
                sales +=possible_sales * 1.0;
            }




        }
        System.out.printf("%.2f%n",sales);
        System.out.printf("%.2f",count_of_rating / n);



    }
}
