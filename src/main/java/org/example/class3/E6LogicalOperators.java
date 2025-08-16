package org.example.class3;

public class E6LogicalOperators {
    public static void main(String[] args) {


        //Logical AND Operator
        boolean isWeekend = true;
        boolean isGoodWeather = true;
        boolean isFeelingGood = true;
        int age=25;

        if (isWeekend && isFeelingGood && isGoodWeather&& age>=18) {
            System.out.println("Go outside for dinner and later drink");
        } else {
            System.out.println("Stay Home and watch something");
        }

    }
}
