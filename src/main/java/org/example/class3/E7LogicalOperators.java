package org.example.class3;

public class E7LogicalOperators {
    public static void main(String[] args) {


        //Logical AND Operator
        boolean isWeekend = true;
        boolean isGoodWeather = true;
        boolean isFeelingGood = true;
        int age=25;
        String name="Washington";

        if (isWeekend && isFeelingGood && isGoodWeather&& age>=18 && name.equalsIgnoreCase("Monica")) {
            System.out.println("Go outside for dinner and later drink and dance");
        } else {
            System.out.println("Stay Home and watch something");
        }

    }
}
