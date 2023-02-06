package Urok6.Upr6;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        for (int i =num1 ; i <=num2 ; i++) {

            int sixNum = i%10;
            int fifthNum = i/10%10;
            int fourNum = i/100%10;
            int threeNum = i/1000%10;
            int twoNum = i/10000%10;
            int oneNum = i/100000%10;

            int evenNum = oneNum + threeNum + fifthNum;
            int oddNum = twoNum + fourNum + sixNum;
             if (evenNum == oddNum){
                 System.out.printf("%d ",i);
             }

        }
    }
}
