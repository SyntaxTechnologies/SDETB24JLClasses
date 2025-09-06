package org.example.class5;

public class E92DArrays {
    public static void main(String[] args) {

        int [][] numbers={
                {1,2,3,4,5},
                {4,5,6,4,7},
                {2,2,2,2,2},
                {9,7,5,3,1}
        };


        for (int row = 0; row <numbers.length ; row++) {
            for (int col = 0; col <numbers[row].length; col++) {
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();
        }
/*
        for (int i = 0; i <= 4; i++) {
            System.out.print(numbers[0][i]+" ");
        }
        System.out.println();

        for (int i = 0; i <= 4; i++) {
            System.out.print(numbers[1][i]+" ");
        }
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            System.out.print(numbers[2][i]+" ");
        }
        System.out.println();
        for (int i = 0; i <= 4; i++) {
            System.out.print(numbers[3][i]+" ");
        }*/



    }
}
