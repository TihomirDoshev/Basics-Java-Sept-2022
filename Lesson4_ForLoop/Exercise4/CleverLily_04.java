package Urok4.Upr4;

import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        int countToys = 0;

        //преминаваме през всеки рожден ден и проверяваме дали е четна или нечетна
        //пресмятаме колко пари спестява за четните рождени дни/ колко играчки е събрала
        //пресметнем общата сума на събраните пари
        //проверяваме дали общата сума е достатъчна, за да купи пералнята

        for (int currentAge = 1; currentAge <= age; currentAge++){

            if (currentAge % 2 ==0){
                sum = sum + (currentAge * 5 - 1);// sum += i * 5 - 1
            }else {
                countToys++;
            }

        }

        double finalSum = sum + countToys * toyPrice;

        double diff = Math.abs(finalSum - priceWashingMachine);

        if (finalSum >= priceWashingMachine){
            //double leftMoney = finalSum - priceWashingMachine;

            System.out.printf("Yes! %.2f", diff);
        }else {
            //double neededMoney = priceWashingMachine - finalSum;

            System.out.printf("No! %.2f", diff);
        }
    }
}
