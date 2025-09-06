package org.example.project1;

/*
4. Create a 2D array of integers. Develop a program that will calculate the sum of even and
odd numbers separately for that array.
 */


public class Q4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {10, 5, 6, 2, 8},
                {9, 5, 6, 3, 8, 1},
                {25, 5, 2, 5, 9}
        };

        int evenSum = 0;
        int oddSum = 0;
        for (int[] row : numbers) {

            for (int num : row) {
                if (num % 2 == 0) {
                    evenSum = evenSum + num;
                } else {
                    oddSum = oddSum + num;
                }
            }

        }

        System.out.println(evenSum);
        System.out.println(oddSum);

    }
}
