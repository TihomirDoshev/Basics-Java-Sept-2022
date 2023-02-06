package Exam;

import java.util.Scanner;

public class FinalCompetition_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfDancer = Integer.parseInt(scanner.nextLine());
        double numPoints = Double.parseDouble(scanner.nextLine());
        String  season = scanner.nextLine();
        String  location = scanner.nextLine();

        double sumPoints = numOfDancer * numPoints;

        if (location.equals("Bulgaria")){
            if (season.equals("summer")){
                sumPoints = sumPoints - sumPoints * 0.05;
            }else if (season.equals("winter")){
                sumPoints =sumPoints - sumPoints * 0.08;
            }

        }else if (location.equals("Abroad")){
            sumPoints = sumPoints + sumPoints *0.5;
            if (season.equals("summer")){
                sumPoints = sumPoints - sumPoints * 0.1;
            }else if (season.equals("winter")){
                sumPoints =sumPoints - sumPoints * 0.15;
            }

        }
        double sumForCharity = sumPoints *0.75;
        double sumForPerson = (sumPoints - sumForCharity) / numOfDancer;

        System.out.printf("Charity - %.2f%n",sumForCharity);
        System.out.printf("Money per dancer - %.2f",sumForPerson);

    }
}
