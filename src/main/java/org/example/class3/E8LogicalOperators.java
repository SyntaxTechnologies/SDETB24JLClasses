package org.example.class3;

public class E8LogicalOperators {
    public static void main(String[] args) {


        //Logical AND Operator
        boolean isWeekend = true;
        boolean isGoodWeather = true;
        boolean isFeelingGood = true;
        int age=25;
        String name="Monica";

        if ( isWeekend) {
            if(isFeelingGood){
                if(isGoodWeather){
                    if(age>18){
                        if(name.equalsIgnoreCase("Monica")){
                            System.out.println("Go outside for dinner and later drink and dance");
                        }else {
                            System.out.println("Stay Home and watch something");
                        }
                    }else {
                        System.out.println("Stay Home and watch something");
                    }
                }else {
                    System.out.println("Stay Home and watch something");
                }
            }

        } else {
            System.out.println("Stay Home and watch something");
        }

    }
}
