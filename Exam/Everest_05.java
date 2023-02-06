package Exam;

import java.util.Scanner;

public class Everest_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startHeight = 5364;

        int target = 8848;

        int currentHeight = 0;

        int count = 1;

        while (true) {

            String yesOrNo = scanner.nextLine();

            if (yesOrNo.equals("END")) {

                break;

            }

            if (yesOrNo.equals("Yes")) {

                count++;

            }

            if (count == 6) {

                break;

            }

            int height = Integer.parseInt(scanner.nextLine());

            currentHeight += height;

            if (currentHeight+startHeight>=target){

                break;

            }

        } if(startHeight+currentHeight < target){

            System.out.println("Failed!");

            System.out.printf("%d", startHeight+currentHeight);

        } else{

            System.out.printf("Goal reached for %d days!", count);

        }

    }
}
