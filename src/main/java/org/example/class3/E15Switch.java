package org.example.class3;

public class E15Switch {
    public static void main(String[] args) {


        String day="SUNDAY";
        switch (day.toLowerCase()){
            case "monday":
                System.out.println("Weekday");
                break;
            case "tuesday":
                System.out.println("Weekday");
                break;
            case "wednesday":
                System.out.println("Weekday");
                break;
            case "thursday":
                System.out.println("Weekday");
                break;
            case "friday":
                System.out.println("Weekday");
                break;
            case "saturday":
                System.out.println("Weekend");
                break;
            case "sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong Day");
                break;

        }

    }
}
