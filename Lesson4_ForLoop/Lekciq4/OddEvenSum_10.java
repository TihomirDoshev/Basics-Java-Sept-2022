package Urok4.Lekciq4;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int pos = 0; pos < n; pos++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (pos % 2 == 0) {
                evenSum = evenSum + number;

            }else {
                oddSum = oddSum + number;
            }

        }
        if (evenSum == oddSum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",evenSum);
        }else{
            System.out.println("No");
            System.out.printf("Diff = %d",Math.abs(evenSum - oddSum));
        }
    }
}
