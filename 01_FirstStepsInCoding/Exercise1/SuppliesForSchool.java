package Urok1.Upr1;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        //Четем конзолата
        Scanner scanner=new Scanner(System.in);
        //Пресмятаме цена на продуктите
              // пълна цена химикалки
              // пълна цена маркери
              // пълна цена препарат
             // изчисляване цена за продуктите
             // пълната цена с отстъпка
        int packPen = Integer.parseInt(scanner.nextLine());
        int packMark= Integer.parseInt(scanner.nextLine());
        int packClearFluid= Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double priceForPens = packPen *5.80;
        double priceForMark = packMark * 7.20;
        double priceForFluid = packClearFluid *  1.20;
        double sumWithoutDiscount = priceForPens + priceForMark + priceForFluid;
        double totalPrice = sumWithoutDiscount - (sumWithoutDiscount *(discount/100.0) );
        System.out.println(totalPrice);




    }
}
