package Urok6.Lekciq6;

import java.util.Scanner;

public class SumOfTwoNumbers_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isFound = false;
        int firstNum = 0;
        int secondNum = 0;
        for (int i = start; i <=stop ; i++) {
            for (int j = start; j <=stop ; j++) {
                count++;
                if (i + j == magicNumber){
                    isFound = true;
                    firstNum =i;
                    secondNum = j;
                    break;
                }

            }
            if (isFound){
                break;
            }
        }
        if (isFound){
            System.out.printf("Combination N:%d (%d + %d = %d)",count,firstNum,secondNum,magicNumber);
        }else {
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);
        }
    }
}
