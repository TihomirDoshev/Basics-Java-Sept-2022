package Urok2.Upr2;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double oldRecord = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeFor1Meter = Double.parseDouble(scanner.nextLine());
//        съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди
//        резултатът трябва да се закръгли надолу до най-близкото цяло число.
//        Да се изчисли времето в секунди, за което Иван ще преплува разстоянието
//        и разликата спрямо Световния рекорд.
        double newSeconds = Math.floor((distanceInMeters/15 ))*12.5;
        double allTime = distanceInMeters * timeFor1Meter + newSeconds;

        if (allTime<oldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",allTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(oldRecord - allTime));
        }

    }
}
