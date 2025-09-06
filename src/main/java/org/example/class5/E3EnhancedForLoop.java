package org.example.class5;

public class E3EnhancedForLoop {

    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50};
       /* for(int number:numbers){
            System.out.println(number);
        }*/

        /*for (int i = 0; i < numbers.length; i=i+2) {
            System.out.println(numbers[i]);
        }*/

        for(int i=numbers.length-1;i>-1;i--){
            System.out.println(numbers[i]);
        }





    }
}
