package Urok2.Upr2;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());
        int sumTimes = firstTime + secondTime + thirdTime ;
        int minutes = sumTimes / 60 ;
        int seconds = sumTimes % 60 ;
        if (seconds<10){
            System.out.printf("%d:0%d",minutes,seconds);

        }else {
            System.out.printf("%d:%d",minutes,seconds);

        }

    }
}
