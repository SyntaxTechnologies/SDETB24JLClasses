package org.example.class5;

public class Q1 {
    public static void main(String[] args) {

        int[] numbers={10,20,5,2};
        int smallest=numbers[0];
        for (int i = 1; i <numbers.length ; i++) {

            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }

        System.out.println(smallest);
    }
}
