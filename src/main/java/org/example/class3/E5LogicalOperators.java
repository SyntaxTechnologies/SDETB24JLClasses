package org.example.class3;

public class E5LogicalOperators {
    public static void main(String[] args) {


        //Logical AND Operator
        boolean isWeekend = true;
        boolean isGoodWeather = true;
        boolean isFeelingGood = true;

        if (isWeekend && isFeelingGood && isGoodWeather) {
            System.out.println("Go outside for dinner");
        } else {
            System.out.println("Stay Home and watch something");
        }

    }
}
