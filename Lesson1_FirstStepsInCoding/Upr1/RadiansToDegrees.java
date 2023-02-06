package Urok1.Upr1;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        //Четем от конзолата
        double radians = Double.parseDouble(scanner.nextLine());
        //Преобразуваме радианите в градуси
        double degrees = radians * 180 / Math.PI;
        //Принтиране на конзолата
        System.out.println(degrees);


    }

}
