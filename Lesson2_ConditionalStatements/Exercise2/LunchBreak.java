package Urok2.Upr2;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String  movie = scanner.nextLine();
        int movieTime = Integer.parseInt(scanner.nextLine());
        int restTime= Integer.parseInt(scanner.nextLine());

//       по време на  почивката отделяте време за обяд и време за отдих.
//        Времето за обяд ще бъде 1/8 от времето за почивка,
//        а времето за отдих ще бъде 1/4 от времето за почивка.
        double timeForLunch = restTime / 8.0;
        double timeForRest = restTime/4.0;

        double leftTime = restTime - timeForRest - timeForLunch;



        if (leftTime>=movieTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",movie,Math.ceil(leftTime - movieTime));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",movie,Math.ceil(movieTime-leftTime));
        }




    }
}
