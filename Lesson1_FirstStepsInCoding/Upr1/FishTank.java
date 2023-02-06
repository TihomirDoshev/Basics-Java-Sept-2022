package Urok1.Upr1;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Четем от конзолата
        //1- дължина
        //2-ширина
        //3- дълбочина
        //4 - процент заето количество
        //пресмятане обема на аквариума
        //пресмятане обема в литри
        //пресмятане на нужните литри (пълните литри за акрариума *(1-0.17)
        //принтираме

        int length =Integer.parseInt(scanner.nextLine());
        int wight =Integer.parseInt(scanner.nextLine());
        int height =Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volume = length * wight * height;
        double fullTankLiters = volume * 0.001;
        double neededLiters = fullTankLiters * (1-percent/100);
        System.out.println(neededLiters);



    }
}
