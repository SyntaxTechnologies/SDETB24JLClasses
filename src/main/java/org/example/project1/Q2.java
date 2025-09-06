package org.example.project1;

/*
2. Create an array of integer values. After the array is created, calculate the sum of all stored
elements in that array
 */

public class Q2 {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int sum=0;
        for (int num : numbers) {

            sum=sum+num;
        }

        System.out.println(sum);
    }
}
