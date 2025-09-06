package org.example.class5;

public class E4BreakKeyword {
    public static void main(String[] args) {

        int[] numbers={10,20,30,40,50,60,70,15,20,36,101,25,69,82,81,44,55,68,87,25};

        for (int number:numbers) {

            if(number==30){
                System.out.println("Number Found");
                break;
            }
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == 30) {
                System.out.println("Number Found");
                break;
            }
        }


    }
}
