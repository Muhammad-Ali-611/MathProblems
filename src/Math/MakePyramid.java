package Math;

import java.util.Scanner;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                              *
                             * *
                            * * *
                           * * * *
                          * * * * *
                         * * * * * *

        */
        Scanner scanner = new Scanner(System.in);

        int numOfRows , k = 0;
        System.out.println("Enter the number of Rows:::");
        numOfRows = scanner.nextInt();
        for (int i = 1; i <= numOfRows; ++i, k = 0) {
            for (int space = 1; space <= numOfRows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}



