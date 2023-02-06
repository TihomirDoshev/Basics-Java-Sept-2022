package Urok2.Lekciq2;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();

        if (figure.equals("square")) {
            Double a = Double.parseDouble(scanner.nextLine());
            double area = a*a;
            System.out.printf("%.3f",area);
        } else if (figure.equals("rectangle")) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double b = Double.parseDouble(scanner.nextLine());
            double area = a*b;
            System.out.printf("%.3f",area);
        } else if (figure.equals("circle")) {
            Double r = Double.parseDouble(scanner.nextLine());
            double area =Math.PI*(r*r);
            System.out.printf("%.3f",area);
        } else if (figure.equals("triangle")) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double h = Double.parseDouble(scanner.nextLine());
            double area = a*h/2;
            System.out.printf("%.3f",area);

        }


    }
}
