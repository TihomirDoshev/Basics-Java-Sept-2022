package Urok4.Upr4;

import java.util.Scanner;

public class Demooo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 1; a <= 9; a++)
        {
            for (int b = 9; b >=  a; b--)
            {
                for (int c = 0; c <= 9; c++)
                {
                    for (int d = 9; d >= c; d--)
                    {
                        int sum = a + b + c + d;
                        int mult = a * b * c * d;

                        if (sum == mult && n % 10 == 5)
                        {
                            System.out.println(a*1000+b*100+c*10+d*1);
                            return;
                        }
                        else if (mult / sum == 3 && n % 3 == 0)
                        {
                            System.out.println(d*1000+c*100+b*10+a*1);
                            return;
//                            8 * 1000 + 1 * 100 + 9 * 10 + 1 = 8191
                        }
                    }
                }
            }

        }
        System.out.println("Nothing found");
    }
}
